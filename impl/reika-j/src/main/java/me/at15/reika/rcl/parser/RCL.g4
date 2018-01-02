grammar RCL;

// start of parser
// NOTE: we don't use file because it cause error in python runtime
fle
    : pair+
    ;

pair
    : ID '=' value // bare
    | STRING '=' value
    ;

obj
    : '{' pair (',' pair)* '}'
    | '{' '}'
    ;

array
    : '[' value (',' value)* ']'
    | '[' ']'
    ;

value
    : BOOL
    | INT // TODO: negative number, or simple arith expression
    | DOUBLE
    | STRING
    | obj
    | array
    ;
// end of parser

// start of lexer
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

STRING
    : '"' (ESC | ~["\\])* '"'
    ;

ID
    : [a-z] ID_LETTER*
    ;

fragment DIGIT
    : [0-9]
    ;

fragment ESC
    : '\\' ["\\/bfnrt]
    ;

fragment ID_LETTER
    : [a-z]
    | [A-Z]
    | '_'
    ;

WS  : [ \t\r\n] -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;
// end of lexer