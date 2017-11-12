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

- no need to store type in Var node, type only appears in function definition (for now), i.e. `lambda x:Bool. x`

## Typing

[simplebool/syntax.ml](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/simplebool/syntax.ml)

- typing context is just a list, every time a new binding is added, a typing is prepend to the list (so it's kind of like a stack, same as [YinWang's blog](http://www.yinwang.org/blog-cn/2012/08/01/interpreter))
- only abs has typing declaration `(lambda x:Nat. x)`

````ocaml
type ty =
    TyArr of ty * ty
  | TyBool

type term =
    TmVar of info * int * int
  | TmAbs of info * string * ty * term
  ...

type binding =
    NameBind 
  | VarBind of ty

let addbinding ctx x bind = (x,bind)::ctx
````

> The way in which the :: operator attaches elements to the front of a list reflects the fact that OCaml's lists are in fact singly linked lists https://realworldocaml.org/v1/en/html/lists-and-patterns.html

[simplebool/core.ml](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/simplebool/core.ml)

Abs

- `=` use prefix instead of infix because later it will be more complex, it's structural equality instead of pointer equality
  - we need to define a function to compare types

````ocaml
let rec typeof ctx t =
  match t with
    TmVar(fi,i,_) -> getTypeFromContext fi ctx i
  | TmAbs(fi,x,tyT1,t2) ->
      let ctx' = addbinding ctx x (VarBind(tyT1)) in
      let tyT2 = typeof ctx' t2 in
      TyArr(tyT1, tyT2)
  | TmApp(fi,t1,t2) ->
      let tyT1 = typeof ctx t1 in
      let tyT2 = typeof ctx t2 in
      (match tyT1 with
          TyArr(tyT11,tyT12) ->
            if (=) tyT2 tyT11 then tyT12
            else error fi "parameter type mismatch"
        | _ -> error fi "arrow type expected")
````

test.f

````
/* Examples for testing */

 lambda x:Bool. x;
 (lambda x:Bool->Bool. if x false then true else false) 
   (lambda x:Bool. if x then false else true);
````  

OCamel implementation

````
(lambda x:Bool. x) : Bool -> Bool
true : Bool
```` 

Java implementation (type checker only)

````
(lambda x:Bool. x) : (Bool -> Bool)
(lambda x:(Bool -> Bool). if x false then true else false) (lambda x:Bool. if x then false else true) : Bool
````

## Evaluation

[simplebool/main.ml](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/simplebool/main.ml)

- first get type `tyT` using `typeof`
- then evaluate, print as `result : type`

````ocaml
let rec process_command ctx cmd = match cmd with
  | Eval(fi,t) -> 
      let tyT = typeof ctx t in
      let t' = eval ctx t in
      printtm_ATerm true ctx t'; 
      print_break 1 2;
      pr ": ";
      printty tyT;
      force_newline();
      ctx
  | Bind(fi,x,bind) -> 
      pr x; pr " "; prbindingty ctx bind; force_newline();
      addbinding ctx x bind
````