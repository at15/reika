grammar Reika;

prog
    : (term ';')+
    ;

value
    : BOOL # ValBool
    | INT # ValInt
    | DOUBLE # ValDouble
    ;

term
    : value # TmValue
    | op=('-'|'!') term # TmUnary
    | term op=('*'|'/'|'%') term # TmBinary
    | term op=('+'|'-') term # TmBinary
    | '(' term ')' # TmBrackets
    ;

BOOL
    : 'true'
    | 'false'
    ;

INT
    : '0'
    | [1-9]+[0-9]*
    ;

DOUBLE
    : [0-9]+ '.' [0-9]+
    ;

WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;