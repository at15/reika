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

- Ident, extends RefTree
- Select, also used for refer, i.e. `a.foo`
- This, current class
- Super, supper class
- Apply, i.e. `a.foo(1, 2)` is `Apply(Select(Ident(a), foo), (1,2))`, args is `List[Tree[T]]`
- TypeApply, `def foo[T](a: T)`, `foo[Int](1)`, `Apply(TypeApply(Ident(foo), List(int)), 1)` it is actually a DAG
- Literal, constant
- New,

20:32

## Extra

Language Server Protocol

- in `languageserver` folder
- use https://github.com/eclipse/lsp4j under the hood

Bot

- in `bot` folder