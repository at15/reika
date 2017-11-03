grammar Untyped;

prog: stat+ ;

stat: term ';'
    ;

term: ID # Var
    | 'lambda' ID '.' term # Abs
    | term term # App
    | '(' term ')' # Brackets
    ;

ID  :   [a-zA-Z]+ ;
WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;