grammar Untyped;

prog: stat+ ;

stat: term ';'
    ;

term: ID # Var
    | term term # App
    | 'lambda' ID '.' term # Abs
    | '(' term ')' # Brackets
    ;

ID  :   [a-zA-Z]+ ;
WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;