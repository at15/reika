grammar Arith;

// support negative number in ANTLR https://github.com/at15/reika/issues/18
// 12 - 3;
// 0 - 2;
// - 2 + 3;
// 1 - 2 * 3;
// 1 + 2 - 3;

prog
    : (term ';')+
    ;

term
    : '-' term # Negative
    | term BINARY_OP_HIGH term # MulOrDiv
    | term ('-'|'+') term # AddOrMinus
    | INT # Number
    ;

INT
    : '0'
    | [1-9]+[0-9]*
    ;


BINARY_OP_LOW
    : '+'
    | '-'
    ;

BINARY_OP_HIGH
    : '*'
    | '/'
    | '%'
    ;

UNARY_OP
    : '-'
    | '!'
    ;

WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;