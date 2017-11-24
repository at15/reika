grammar Reika;

// TODO: how to use new line instead of ; and also support multi line expression
prog
    : (term ';')+
    ;

// TODO: symbol (immutable string) and string (list of character)
value
    : BOOL # ValBool
    | INT # ValInt
    | DOUBLE # ValDouble
//    | STRING # LtString
    ;

// TODO: [0:123], empty list? but what about type?
//list
//    : '[' literal+ ']' # ListLt
//    | '[' list+ ']' # ListList
//    | '[' record+ ']' # ListRecord
//    ;


// TODO: allow record to have non-literal types? nested record etc.
//record
//    : '{' (ID ':' literal)+ '}' # RecordLt
//    ;

term
    : value # TmValue
    | '-' term # TmUnaryNegative
    | '!' term # TmUnaryNot
    | term BINARY_OP_HIGH term # TmBinaryHigh
    | term BINARY_OP_LOW term # TmBinaryLow
//    | list # TmList
//    | record # TmRecord
    | '(' term ')' # TmBrackets
    ;

BOOL
    : 'true'
    | 'false'
    ;

INT
    : [1-9]+[0-9]*
    ;

DOUBLE
    : [0-9]+ '.' [0-9]+
    ;

// TODO: use single quote for string?
STRING
    : '"' (ESC|.)*? '"'
    ;

fragment
ESC
    : '\\"' // \"
    | '\\\\'  // \\
    ;

BINARY_OP_LOW
    : '+'
    | '-'
    ;

// 'random_from' TODO: use ? and # like q does, and it should be high?
BINARY_OP_HIGH
    : '*'
    | '/'
    | '%'
    ;

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

WS  :   [ \t\n\r]+ -> skip;
// TODO: support Java Doc like block comment for @author etc.
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;