# Log

## 2017-11-24

- solved the precedence #19 and negative #18 and duplicate binary operator handling in visitor #22, by specify all the token in parser rule, use same label for alternative and label token in rule.
- try to reduce the duplicated logic for binary operators was the initial cause of precedence problem [#22]https://github.com/at15/reika/issues/22)
- need to recap what is lexer, what is parser to understand what
should be put in parser rule, what should be put into lexer rule
- #18 negative number comes up again for `1 + 2 - 3;`
- add doc folder for reika-j, specify the phases
- remove statement, use term directly

## 2017-11-23

- dealt with negative number using unary expression [#18](https://github.com/at15/reika/issues/18)
- working on precedence [#19](https://github.com/at15/reika/issues/19), but got stuck of definition of node.
- copied util code from TAPL, parser wrapper, error listener etc.
- [ ] need to implement the calculator to see the whole thing working