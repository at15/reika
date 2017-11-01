grammar Arith;

prog: term+ ;

term: 'true' # ConsTrue
    | 'false' # ConsFalse
    | 'if' term 'then' term 'else' term # Conditional
    | '0' # ConsZero
    | 'succ' term # Succ
    | 'pred' term # Pred
    | 'iszero' term # ZeroTest
    ;

WS  :   [ \t\n\r]+ -> skip;