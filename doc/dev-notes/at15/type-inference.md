# Type Inference

- [#26](https://github.com/at15/reika/issues/26)

## Progamming Languages: Application and Interpretation 15

Using Racket

### 15.1 Types as Static Disciplines

- static type checking: checking (declared) types before the program even executes
- it can be useful to think of parsing as being simply the very simplest kind of type-checking:
determining (typically) whether the program obeys a context-free syntax
- type checking then asks whether it obeys a context-sensitive (or richer) syntax
- type checking is a generalization of parsing, in that both are concerned with syntactic methods for enforcing disciplines on programs

### 15.2 A Classical View of Types

#### 15.2.1 A Simple Type Checker

- typing environment, maps names to types
- tc, tells what type an expression is
  - no difference between handling `plus` and `mult` expression
  - application
    - compute value of function
    - compute value of argument
    - ensure function expression is function type
    - check argument expression is compatible type
  - abstraction
    - extend typing environment with formal name bound to its type, and in that extended environment type-check the body

**The difference between interpreter and type-checker**

- in the interpreter, application was responsible for evaluating the argument expression, extending the environment, and evaluating the body
- in type-checker, application does check the argument expression but leaves the environment alone, and simply returns the type of the body without traversing it. Instead, the body is actually traversed by the checker when checking a function definition, so this is the point at which the environment actually extends

#### 15.2.3 Recursion in Code

- previous done via desugaring

````
((lambda (x) (x x)
  (lambda (x) (x x)))
````

becomes a infinite type, why?

- we cannot type Omega at all
- the typed language we have so far has a property called strong normalization: every expression that has type will terminate computation after a finite number of steps

What's the use of a language in which all programs terminate

- none, for general purpose programming language
- linker in Standard ML
- scheduler, packet-filter, real-time event processor

- [ ] TODO: the real code

#### 15.2.4 Recursion in Data

- [ ] TODO: skipped for now

#### 15.2.5 Types, Time, and Space

- save time, no longer need to check at runtime
- save space, type tags are no longer necessary

#### 15.2.6 Types and Mutation

- traditional type checkers: types must be invariant across mutation

#### 15.2.7 The Central Theorem: Type Soundness

Difference between type checker and evaluator

- type checker only sees program text, evaluator runs over actual stores
- type environment binds identifier to types, evaluator environment binds identifiers to values or locations
- type checker compresses (even infinite) sets of values into types, whereas the evaluator treats these distinctly
- type checker always terminates, whereas the evaluator might not
- type checker passes over they body of each expression only once, whereas the evaluator might pass over each body anywhere from zero to infinite times

Progress and Preservation (hi, TAPL ...)

### 15.3 Extension to the Core