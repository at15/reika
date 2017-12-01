grammar NegativeNumberInParser;

// handle negative number in ANLTR
// the precedence matters

prog: (term ';')+ ;

term
    : INT
    | '-' term
    | term ('*' | '/') term
    | term ('+' | '-') term
//    | '-' term // try -1 + 2
    ;

INT: [0-9]+;
WS: [ \t\r\n] -> skip;