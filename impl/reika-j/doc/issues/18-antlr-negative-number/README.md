# Negative number in ANTLR

The main problem is `-` can mean negative or minus based on context

- [#21 Lexer and Parser](https://github.com/at15/reika/issues/21)
  - we can't define INT as `-?[0-9]+` because lexer will turn it into a token 
  and `1 - 2` won't be matched by parser rule `expr - expr` 
- [#22 Avoid duplicated rules for binary operations](https://github.com/at15/reika/issues/22)
  - you can use label to add attributes to the context

A core problem is, if you have a token in parser rule and a same one in lexer, you have two token, and the one in parser
has higher precedence.

````antlrv4
grammar Arith;
exp
    : exp '-' exp
    | INT
    ;
   
INT: [0-9]+;
MINUS: '-';
````

the `.tokens` file would be

````text
T__0=1
INT=2
MINUS=3
'-'=1
````