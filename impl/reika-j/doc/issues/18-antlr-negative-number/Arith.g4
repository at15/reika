grammar Arith;

// support negative number in ANTLR https://github.com/at15/reika/issues/18
// 12 - 3;
// 0 - 2;
// - 2 + 3;
// 1 - 2 * 3;
// 1 + 2 - 3;

prog
    : (term SEMI)+
    ;

term
    : op=(NOT | MINUS) term # TmUnary
    | term op=(MUL | DIV | MOD) term # TmBinary
    | term op=(ADD | MINUS) term # TmBinary
    | INT # TmNum
    ;

SEMI : ';';

NOT: '!';
ADD: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';

INT
    : '0'
    | [1-9]+[0-9]*
    ;

WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;