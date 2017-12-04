# Dotty

- https://github.com/at15/reika/issues/35
- http://dotty.epfl.ch/docs/internals/overall-structure.html
- https://www.slideshare.net/Odersky/compilers-are-databases/15
- http://guillaume.martres.me/talks/dotty-live-demo/#/5

## Read Source

- it has submodules, and then idea works like a charm
- update IDEA's config in IDEA_HOME/bin/idea64.vmoptions
  - Xmx1024m initial memory allocation pool
  - Xms4096m maximum memory allocation pool
  - XX:ReservedCodeCacheSize=512m

````
git clone
git submodule update --init
````

## Compiler

- [compiler/src/dotty/tools](https://github.com/lampepfl/dotty/tree/master/compiler/src/dotty/tools)

core

- `Contexts.scala`
- `Phases.scala`
  - L139 `usePhases`
- `Signature.scala` used for overloading

Context

- http://dotty.epfl.ch/docs/internals/contexts.html
- contains settings, peroid, comilationUnit, phase, (current) tree, (current) typer
- copy on write for tree
- (somehow, feels like golang's context, especially Tree has the withType method)

its symbol is quite different from traditional compiler due to need for incremental compile

[period](http://dotty.epfl.ch/docs/internals/periods.html)

- a hour in compiler is one run, a minute in compiler is one phase
- symbol changes as compile goes on, a destructive way is update the shared table,
a functional way is to create new symbol for each phase, dotty way is a **function from compiler phase to type**
- in `core/Periods.scala`

introduced a serialization format for typed AST called TASTY

- allows to get scala source from compiled classfiles
- dotty can recompile from TASTY

## Dotty Internals 1: Tree & Symbols

https://www.youtube.com/watch?v=yYd-zuDd3S8

- `Compiler` is the entry point
- `ast/Trees.scala`
  - `untped.scala`, some trees only exist as untyped like `DoWhile`, they disappear after type check
  - `tpd.scala`, provide convenient API for construct AST classes
  - immutable
  
### Trees

- Ident, extends RefTree
- Select, also used for refer, i.e. `a.foo`
- This, current class
- Super, supper class
- Apply, i.e. `a.foo(1, 2)` is `Apply(Select(Ident(a), foo), (1,2))`, args is `List[Tree[T]]`
- TypeApply, `def foo[T](a: T)`, `foo[Int](1)`, `Apply(TypeApply(Ident(foo), List(int)), 1)` it is actually a DAG
- Literal, constant
- New,
- Typed, i.e. `1: Any`
- NamedArg, i.e. `def foo(bar: Int, boo: Int)`, like in python you can `foo(boo = 1, bar = 1)`
- Assign, `var f = 0`, `f = 1`, it's `lhs` can be very complex, like a field in a class `(new C).f = 1`
- Block, `{ val s = 12 s + 1 }` it has `stats` and `expr`
- If
- Closure (28:04) `val z = 1 List(1).map(x => x + z)`,  `env, meth, tpt`, `meth` is the generated annonymous function
- Match & CaseDef, Match is selector, cases (CaseDef), CaseDef is pat, guard, body, pattern is Bind, UnApply etc.
- Return, expr, from
- Try, expr, cases, finalizer
- SeqLiteral, i.e. `def foo(s: Int*) foo(1, 2, 3)`
- JavaSeqLiteral, use jvm array
- Inlined, for generic and meta programming
- **TypeTree** (35:09)
- SingletonTypeTree, And (Int && Double), Or (Int || Double)
- skipped, Refined, Applied, Ploy, ByName ... TypeTree
- Bind, Alternative, UnApply
- **ValDef** (38:00), field or local variable, name, tpt, preRhs: LazyTree
- DefDef, method, name, tparams, vparamss, tpt, preRhs
- TypeDef, class `class C {}` or local type, `type A = Int`
- Template, body of the class, self, preBody
- Import, PackageDef, Annotated
- Thicket, a helper tree
- EmptyValDef
- **withType** (50:@5) and `ThisTree`, same tree but typed?

### Symbols

1:01:09

- represent things people refer to but you are not compliling, i.e. standard libary
- `core/Symbols.scala`
  - Symbol: field, variable
  - ClassSymbol, NoSymbol
  - ErrorSymbol (also ErrorTree, ErrorType)
    - try to compile as much as you can and output all the errors
- every symbol is given a Denotations, and it gives what the symbol means (difference from scalac)
  - a symbol at a time single denoatation, can change over time
  - can refer both term and type
- `SymDenotation`, symbol, ownerIfExisits, initInfo
- `Flags`, for optimization, just numeric tag
  - termFlag and typeFlag can use same number

### Phases

1:13:00

- small phases are joined together to reduce overhead of traverse tree
- `Periods.scala` a phase, or a block of phases
  - runid 17 bits, for using in ide, could have many runs
  - Nowwhere, ValidForever
- dotty assume you may reuse data from previous phases

### Debug

1:23:00

- break points one line, exception

## Extra

Language Server Protocol

- in `languageserver` folder
- use https://github.com/eclipse/lsp4j under the hood

Bot

- in `bot` folder
