# Types and Programming Language

Decide to put the implementation of TAPL inside the Reika repo (for now).

Related issues:

- GitHub project https://github.com/at15/reika/projects/2
- [at15/mini-impl#6](https://github.com/at15/mini-impl/issues/6)
- [at15/papers-i-read#76](https://github.com/at15/papers-i-read/issues/76)

## Arith

- Chapter 4 An ML Implementation of Arithmetic Expressions
- official OCaml implementation can be found [here](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/arith)

Syntax

![syntax](p24-untyped-syntax.png)

[syntax.ml](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/arith/syntax.ml)

````ocaml
type term =
    TmTrue of info
  | TmFalse of info
  | TmIf of info * term * term * term
  | TmZero of info
  | TmSucc of info * term
  | TmPred of info * term
  | TmIsZero of info * term

type command =
  | Eval of info * term
````

The first grammar ~~has problem~~ current grammar does not support numbers except zero ...

````
java -cp ./third_party/antlr-4.7-complete.jar:./build/libs/tapl-0.0.1-SNAPSHOT.jar org.antlr.v4.gui.TestRig me.at15.tapl.arith.Arith prog -gui
1 + 1
line 1:0 token recognition error at: '1'
line 1:2 token recognition error at: '+'
line 1:4 token recognition error at: '1'
line 2:0 mismatched input '<EOF>' expecting {'true', 'false', 'if', '0', 'succ', 'pred', 'iszero'}
````

This works

```
java -cp ./third_party/antlr-4.7-complete.jar:./build/libs/tapl-0.0.1-SNAPSHOT.jar org.antlr.v4.gui.TestRig me.at15.tapl.arith.Arith prog -gui
if true then 0 else false
0
true
````

![arith-parse-tree](arith-parse-tree.png)