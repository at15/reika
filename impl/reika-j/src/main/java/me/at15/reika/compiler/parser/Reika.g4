grammar Reika;

// parser start

prog
    : (term ';' | func)+
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
    | 'List' # TypeList
    | type '[' type ']' # TypeGeneric
    ;

typedId
    : ID ':' type
    ;

// TODO: optionalType: (':' type)? it is used in both var and function

term
    : constant # TmCons
    | ID # TmVar
    | op=('-'|'!') term # TmUnary
    | term op=('*'|'/'|'%') term # TmBinary
    | term op=('+'|'-') term # TmBinary
    | 'val' ID (':' type)? '=' term # TmVal
    | '(' term ')' # TmBrackets
    | '[' term (',' term)* ']' # TmList
    | ID '(' term (',' term )* ')' # TmApp // TODO: can we remove the brackets?
    ;

func
    : 'func' ID '(' typedId (',' typedId)* ')' (':' type)? '{' (term ';')* '}'
    ;

// parser end

// lexer start

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

// lexer end