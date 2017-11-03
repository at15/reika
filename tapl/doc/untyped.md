# Untyped

- Chapter 7 An ML Implementation of the Lambda-Calculus
- [tapl Untyped lambda-calculus #6](https://github.com/at15/reika/issues/6)
- [official OCaml implementation](https://www.cis.upenn.edu/~bcpierce/tapl/checkers/untyped/)

## Syntax

Pure untyped lambda calculus

![pure lambda calculus](p53-untyped-lambda-calculus-syntax.png)

test.f for untyped

````
x;

lambda x. x;
(lambda x. x) (lambda x. x x); 
````

- [ ] TODO: can we have the parameter of function looks like a function, or it can only be just one ID
- [x] TODO: #7 when function body contains function application, it is not parsed properly `lambda x. x x` should have a body `x x` instead of `(lambda x. x) x`, though actually I think latter makes more sense to me, it's not what we get in the OCaml implementation
  - change order of `lambda` and `t t` solve this problem

`(lambda x. x) (lambda x. x x); `

![untyped-lambda-calculus-parse-tree](untyped-lambda-calculus-parse-tree.png)