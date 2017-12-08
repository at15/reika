package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.parser.ReikaBaseVisitor;
import me.at15.reika.compiler.parser.ReikaParser;
import me.at15.reika.compiler.reporter.Position;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * @TODO: need to treat input in REPL and input file differently, file may have package, build symbol etc.
 * https://github.com/at15/reika/issues/28
 */
public class UntypedVisitor extends ReikaBaseVisitor<Tree> {
    @Override
    public Tree visitProg(ReikaParser.ProgContext ctx) {
        List<Tree> trees = new ArrayList<>();
        for (ReikaParser.TermContext tm : ctx.term()) {
            trees.add(visit(tm));
        }
        Position pos = fromContext(ctx);
        return new Block(pos, trees);
    }

    @Override
    public Tree visitTmCons(ReikaParser.TmConsContext ctx) {
        return visit(ctx.constant());
    }

    @Override
    public Tree visitConsBool(ReikaParser.ConsBoolContext ctx) {
        Position pos = fromSymbol(ctx.BOOL().getSymbol());
        return new Constant(pos, Boolean.parseBoolean(ctx.BOOL().getText()), Constant.Tag.BOOL);
    }

    @Override
    public Tree visitConsInt(ReikaParser.ConsIntContext ctx) {
        Position pos = fromSymbol(ctx.INT().getSymbol());
        // TODO: this may not handle negative number, since the token does not catch the negative token
        // TODO: also we may have invalid integer (too big etc.)
        return new Constant(pos, Integer.parseInt(ctx.INT().getText()), Constant.Tag.INT);
    }

    @Override
    public Tree visitConsDouble(ReikaParser.ConsDoubleContext ctx) {
        Position pos = fromSymbol(ctx.DOUBLE().getSymbol());
        // TODO: this may not handle negative number, since the token does not catch the negative token
        // TODO: also we may have invalid double (too big etc.)
        return new Constant(pos, Double.parseDouble(ctx.DOUBLE().getText()), Constant.Tag.DOUBLE);
    }

    private Position fromContext(ParserRuleContext ctx) {
        Position pos = new Position();
        pos.line = ctx.getStart().getLine();
        pos.column = ctx.getStart().getCharPositionInLine();
        pos.lineEnd = ctx.getStop().getLine();
        pos.columnEnd = ctx.getStop().getCharPositionInLine();
        return pos;
    }

    private Position fromSymbol(Token symbol) {
        Position pos = new Position();
        pos.line = symbol.getLine();
        pos.column = symbol.getCharPositionInLine();
        // TODO: there seems to be no way to get exact position of token across two lines
        pos.lineEnd = pos.line;
        pos.columnEnd = symbol.getStopIndex() - symbol.getStopIndex() + pos.column;
        return pos;
    }
}
