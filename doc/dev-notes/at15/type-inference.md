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

#### 15.3.1 Explicit Parametric Polymorphism

- [ ] TODO: skipped

#### 15.3.2 Type Inference

- even in languages with inference, programmers are free (and for documentation purposes, often encouraged - as you have been) to declare types)
- inference can be think as a user convenience of writing less type annotation, but the language underneath is explicitly typed

````
(lambda ([x : number]) : string x)
(* after erasure, the ill-typed one could actually become typeable *)
(lambda (x) x)
````

- previous simple recursive descent type-checking algorithm will no longer work

Two steps

- generate constraints, based on program terms, on what the types must be
- solve constraints to identify inconsistencies and join together constraints spread across the function body

##### Constraint Generation

- constraint generation walks the program source, emitting appropriate constraints on each expression

What can we say about the type of an expression

- it is related to the type of some identifier
- it is related to the type of some other expression
- it is a number
- it is a function, whose domain and range types are presumably further constrained

````
(define-type Constraints
    [eqCon (lhs : Term) (rhs : Term)])

(define-type Term
    [tExp (e : ExprC)
    [tVar (s : symbol)]
    [tNum]
    [tArrow (dom : Term) (rng : Term)])
````

Now we can define the process of generating constraints

````
(define (cg [e : ExprC]) : (listof Constraints))
  (type-case ExprC e)
    - numC
    - idC
    - plus/mul
    - appC
    - lamC))
````

- case numC, `[numC (_) (list (eqCon (tExp e) (tNum)))]`
- case idC, `[idC (_) (list (eqCon (tExp e) (tVar s)))]`
- case plus/mul, constraints in each sub expression, each sub should be numeric, entire exp is numeric

````
[plusC (l r) (append3 (cg l)
                      (cg r)
                      (list (eqCon (tExp l) (tNum))
                            (eqCon (tExp r) (tNum))
                            (eqCon (tExp e) (tNum))))]
````

function definition lamC

````
[lamC (a b) (append (cg b)
                    (list (eqCon (tExp e) (tArrow (tVar a) (tExp b)))))]
````

function application appC

````
[appC (f a) (append3 (cg f)
                     (cg a)
                     (list (eqCon (tExp f) (tArrow (tExp a) (tExp e)))))]
````

##### Constraint Solving Using Unification

- the goal of unification is generate a substitution, or mapping from variables to terms that do not contain any variables
- solved using gaussian elimination
  - [ ] can have under and over constrained
- iterate over the set of constraints, total 4^2 = 16 cases, can use less cases to cover in actual code
- begins with all constraints and empty substitution
- when all constraints have been disposed, unification returns the final substitution set.

Unification process

- if left side is variable (?), add right side to substitution to truly eliminate it
  - include a occurs check, a check for whether the same variable occurs on both sides, if it does, decline to unify

- if left side is var, lookup in substitution
  - if present, replace current constraint with a new one, otherwise, extend the substitution
  - else, extend substitution
- expression designator is same as var (??)
- number, check right hand side
  - number, do nothing
  - function, type error
  - var and expr can't be there
- function, extend constraints instead of shrink it

- if above process success, the success of the above process implies that the program would have typed-checked, so we need not explicitly run the type-checker over this program
- error messages are harder to understand
- over-constrained, type error
- under-constrained, don't have enough information to make definitive statement about all expressions `(lambda (x) x)` becomes `('a -> 'a)`
- automatically computes the most general types for an expression, also known as principle types