grammar Sb;

prog: stat+ ;

stat: term ';' ;

term: ID # Var
    | term term # App
    | 'lambda' ID ':' type '.' term # Abs
    | '(' term ')' # Brackets
    ;

type: 'Bool' # TyBool
    | type '->' type # TyAbs
    ;

ID  :   [a-zA-Z]+ ;
WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;