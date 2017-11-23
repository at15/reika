grammar Reika;

prog
    : stat+
    ;

// TODO: how to use new line instead of ; and also support multi line expression
stat
    : term ';'
    ;

term
    : literal # LiteralTerm
    | list # ListTerm
    | record # RecordTerm
    | '(' term ')' # BracketsTerm
    ;

literal
    : BOOL # BoolLiteral
    | INT # IntLiteral
    | DOUBLE # DoubleLiteral
    | STRING # StringLiteral
    ;

// TODO: [0:123]
list
    : '[' literal+ ']'
    ;

// TODO: allow record to have non-literal types? nested record etc.
record
    : '{' ID ':' literal (',' ID ':' literal)* '}'
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

BIN_OP
    : '+'
    | '-'
    | '*'
    | '/'
    | 'random'
    ;

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

WS  :   [ \t\n\r]+ -> skip;
// TODO: support Java Doc like block comment for @author etc.
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
SINGLE_COMMENT : '//' .*? '\n' -> skip;