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
    private AstErrorListener astErr;

    public UntypedVisitor(AstErrorListener astErr) {
        this.astErr = astErr;
    }

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
        int val = 0;
        try {
            val = Integer.parseInt(ctx.INT().getText());
        } catch (NumberFormatException ex) {
            addError(ctx.INT().getSymbol(), "invalid int literal " + ctx.INT().getText() + " " + ex.getMessage());
        }
        if (ctx.sign != null) {
            return new Constant(pos, -1 * val, Constant.Tag.INT);
        }
        return new Constant(pos, val, Constant.Tag.INT);
    }

    @Override
    public Tree visitConsDouble(ReikaParser.ConsDoubleContext ctx) {
        Position pos = fromSymbol(ctx.DOUBLE().getSymbol());
        double val = 0;
        // TODO: it seems there is huge double does not throw exception like huge int does, java would cut its precision?
        // as shown by errorprone http://errorprone.info/bugpattern/FloatingPointLiteralPrecision
        try {
            val = Double.parseDouble(ctx.DOUBLE().getText());
        } catch (NumberFormatException ex) {
            addError(ctx.DOUBLE().getSymbol(), "invalid double literal " + ctx.DOUBLE().getText() + " " + ex.getMessage());
        }
        if (ctx.sign != null) {
            return new Constant(pos, -1 * val, Constant.Tag.DOUBLE);
        }
        return new Constant(pos, val, Constant.Tag.DOUBLE);
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
        pos.columnEnd = pos.column + symbol.getStopIndex() - symbol.getStartIndex();
        return pos;
    }

    private void addError(Token symbol, String msg) {
        AstError err = new AstError(fromSymbol(symbol), msg);
        this.astErr.add(err);
    }
}
