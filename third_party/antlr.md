# ANTLR

- download the complete jar `make download`
- `source env.sh` to get `antlr4` and `grun` command
  - [ ] TODO: the path is hardcoded

Java

- generate parser using `antlr4 Hello.g4`, add `-visitor` if you need visitor pattern
- `javac *.java`
- `grun Hello r -tokens`
  - enter `hello jack`
  - press `Ctrl + D` to end input
  - [x] FIXME(d): `Can't load Hello as lexer or parser`, forgot to run `javac *.java`
- `grun Hello r -gui` and follow above steps would show a dialog of visualized trees

Python

- [python-target](https://github.com/antlr/antlr4/blob/master/doc/python-target.md)
- `antlr4 -Dlanguage=Python3 Hello.g4`

JavaScript

- [js-target](https://github.com/antlr/antlr4/blob/master/doc/javascript-target.md)
- `antlr4 -Dlanguage=JavaScript Hello.g4`
