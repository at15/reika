grammar SimpleBin;

prog: (term  ';')+;

term
    : INT # Int
    | BOOL # Bool
    | term op=('&&' | '||') term # BinOp
    | term op=('+' | '-') term # BinOp
    | '(' term ')' # Brackets
    ;


INT: [0-9]+;
BOOL: 'true' | 'false';
WS: [ \t\r\n] -> skip;