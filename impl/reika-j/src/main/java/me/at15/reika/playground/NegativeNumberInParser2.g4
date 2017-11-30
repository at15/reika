grammar NegativeNumberInParser2;

// handle negative number in ANLTR
// avoid inspect unary for optmize literal in AST

prog: (term ';')+ ;

literal
    : '-'? INT // try -1 + 2
    ;

term
    : literal
    | '-' term
    | term ('*' | '/') term
    | term ('+' | '-') term
    | '(' term ')'
    ;

INT: [0-9]+;
WS: [ \t\r\n] -> skip;