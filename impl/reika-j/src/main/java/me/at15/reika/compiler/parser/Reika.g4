grammar Reika;

prog
    : (term ';')+
    ;

constant
    : BOOL # ConsBool
    | sign='-'? INT # ConsInt
    | sign='-'? DOUBLE # ConsDouble
    ;

// TODO: merge builtin types?
type
    : 'Int' # TypeInt
    | 'Double' # TypeDouble
    | 'Bool' # TypeBool
    ;

term
    : constant # TmCons
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