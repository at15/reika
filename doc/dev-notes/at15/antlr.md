# ANTLR

The Definitive ANTLR 4 Reference

- P69 core notation, `?, *, +, |`
- P70 common patterns
- P71-73 precedence, associativity and left recursion
- P80-81 lexer starter kit
- [ ] P216 Python new line (no more `;`)

Language Implementation Patterns

- P21 2.2 LL Recursive Descent Parser
- P25 2.3 Tokenize
  - group character into tokens, so parser rules can be more generic `x > 1` vs. `ID > NUM`
  - lexer takes in characters and generate tokens
  - parser takes in tokens and generate parse tree
- [ ] symbol table
- [ ] enforce static typing

## Grammar file

- Ucfirst is token (lexer), lower case is rule (parser)
  - [ ] this is mentioned in book or doc

## ANTLR3 Chap 5 Walking and Rewriting Trees

P113 External Tree Visitor

- rely on node types themselves
- rely on node's token type

double-dispatch, one `visit` on node, one `visit` on visitor

````
public class AddNode extends Node {
  public Node l;
  public Node r;
  // dispatcher, in ANTLR4 generated parse tree context, it is called accept
  public void visit(MathVisitor visitor) {
    visitor.visit(this);
  }
}

public interface MathVisitor {
  void visit(AddNode n);
  void visit(IntNode n);
}

public class PrintVisitor implements MathVisitor {
  // NOTE: in ANTLR4, we are using visit(n.l), because the visit method is 
  // public T visit(ParseTree tree) {}
  //    return tree.accept(this);
  // }
  public void visit(AddNode n) {
    n.l.visit(this);
    System.out.println('+')
    n.r.visit(this);
    System.out.println();
  }
}
````

the example is pretty similar to the visitor we use in ANTLR4, except

- in visitor
  - no overload on `visit` method, the generated interface has name like `visitInt`
  - `visit` method would call `node.accept(this)`, so write `visit(n.child)` instead of `n.child.accept(this)`
- in node (parse tree context)
  - `visit` is called `accept`
  - does not call `visitor.visit(this)`, but call its own named method, like `IntNode` would call `visitInt`

## ANTLR3 Chap 8 Enforcing Static Typing Rules

Three pass

- parser builds an AST (not parse tree?)
- builds scope tree and populates a symbol table
- compute type of each expression
  - type promotion
  - typing checking

In practice, second and third can be put into single pass, it's even possible to put all three into one (lua?). 
Unless run-time speed is critical, it's better to break into different parts

- [ ] P113 External Tree Visitor
- [ ] P159 Symbol Table
- hmm, the logic is hard coded in grammar file

Automatic Type Promotion

- we can do our syntax sugar for method operation in similar way, but how to combine it with compute type of each expression