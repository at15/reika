grammar Arith;

prog: stat+ ;

stat: term ';'
    ;

term: 'true' # ConsTrue
    | 'false' # ConsFalse
    | 'if' term 'then' term 'else' term # Conditional
    | '0' # ConsZero
    | 'succ' term # Succ
    | 'pred' term # Pred
    | 'iszero' term # ZeroTest
    | '(' term ')' # Brackets
    ;

WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;