grammar NegativeNumInLexer;

// handle negative number in ANLTR
// should not put in lexer

// -1 + 2;
// - 1 + 2;
prog: (term ';')+ ;

term
    : INT
    | term ('*' | '/') term
    | term ('+' | '-') term
    ;

INT: '-'? [0-9]+;
WS: [ \t\r\n] -> skip;