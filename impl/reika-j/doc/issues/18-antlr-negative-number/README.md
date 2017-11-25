# Negative number in ANTLR

The main problem is `-` can mean negative or minus based on context

- [#21 Lexer and Parser](https://github.com/at15/reika/issues/21)
  - we can't define INT as `-?[0-9]+` because lexer will turn it into a token 
  and `1 - 2` won't be matched by parser rule `expr - expr` 
- [#22 Avoid duplicated rules for binary operations](https://github.com/at15/reika/issues/22)
