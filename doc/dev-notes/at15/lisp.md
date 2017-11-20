# Lisp

- http://www.paulgraham.com/rootsoflisp.html
- https://github.com/at15/reika/issues/13

## The Roots of Lisp

### 1 Seven Primitive Operators

- *expression*, atom, or a list of zero or more expressions
- `(quote x)` return x, abbreviate as `'x`
  - code and data are made out of same data structure, and quote is used to distinguish between them
- `(atom x)` returns the atom t if value x is an atom or empty list
- `(eq x y)`
- `(car x)` x is list, return its first element
- `(cdr x)` x is list, return everything after the first element
- `(cons x y)` y is list, returns a list containing the value of x followed by the elements of the value of y
- `(cond (p1 e1) ... (pn en))`  for first p that returns t return its e

```
(cond ((eq 'a 'b) 'first')
      ((atom 'a) 'second'))`
second
```

### 2 Denoting Functions

`((lambda (p1 ... pn) e) a1 ... an)`

to define recursive function

`(label f (lambda (p1 ... pn) e))`

an occurrence of f within e will evaluate to the label expression as if f were a parameter of the function

### 3 Some Functions

- (null. x)
- (and. x y)
- (not. x)
- (append. x y)
- (pair. x y)
- (assoc. x y)

### 4 The Surprise

Write a Lisp interpreter in Lisp

- eval has two parameters, expression and environment (I did the same when writing the one for TAPL)
- eval recursive function

> A label expression is evaluated by pushing a list of the function name the function itself onto the environment

### 5 Aftermath

- mentioned The Art of the Interpreter
