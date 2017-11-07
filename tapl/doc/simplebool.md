# Simple Bool

- Chapter 10 An ML Implementation of Simple Types

## Syntax

Pure simply typed lambda-calculus

![pure simply typed lambda calculus](p103-pure-stlc.png)

test.f for simplebool

````
 lambda x:Bool. x;
 (lambda x:Bool->Bool. if x false then true else false)
   (lambda x:Bool. if x then false else true);
````

![simplebool-parse-tree](simplebool-parse-tree.png)

## AST

## Typing

[simplebool/core.ml](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/simplebool/core.ml)

Abs

````ocaml
let rec typeof ctx t =
  match t with
    TmVar(fi,i,_) -> getTypeFromContext fi ctx i
  | TmAbs(fi,x,tyT1,t2) ->
      let ctx' = addbinding ctx x (VarBind(tyT1)) in
      let tyT2 = typeof ctx' t2 in
      TyArr(tyT1, tyT2)
````

## Evaluation

