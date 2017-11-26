grammar Reika;

prog
    : (term ';')+
    ;

value
    : BOOL # ValBool
    | INT # ValInt
    | DOUBLE # ValDouble
    ;

type
    : 'Int' # TypeInt
    | 'Double' # TypeDouble
    | 'Bool' # TypeBool
    ;

term
    : value # TmValue
    | ID # TmVar
    | op=('-'|'!') term # TmUnary
    | term op=('*'|'/'|'%') term # TmBinary
    | term op=('+'|'-') term # TmBinary
    | 'let' ID (':' type)? '=' term # TmLet
    | '(' term ')' # TmBrackets
    ;

BOOL
    : 'true'
    | 'false'
    ;

INT
    : '0'
    | [1-9] DIGIT*
    ;

DOUBLE
    : DIGIT+ '.' DIGIT+
    ;

ID
    : [a-z] ID_LETTER*
    ;

//TYPE
//    : [A-Z] ID_LETTER*
//    ;

fragment DIGIT
    : [0-9]
    ;

fragment ID_LETTER
    : [a-z]
    | [A-Z]
    | '_'
    ;

WS  :   [ \t\n\r]+ -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;