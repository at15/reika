grammar Sb;

prog: stat+ ;

stat: term ';' ;

term: 'true' # ConsTrue
    | 'false' # ConsFalse
    | 'if' term 'then' term 'else' term # Conditioanl
    | ID # Var
    | term term # App
    | 'lambda' ID ':' type '.' term # Abs
    | '(' term ')' # Brackets
    ;

type: 'Bool' # TyBool
    | type '->' type # TyArr
    ;

ID  :   [a-zA-Z]+ ;
WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;