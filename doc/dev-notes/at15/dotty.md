# Dotty

- https://github.com/at15/reika/issues/35
- http://dotty.epfl.ch/docs/internals/overall-structure.html
- https://www.slideshare.net/Odersky/compilers-are-databases/15

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

## Extra

Language Server Protocol

- in `languageserver` folder
- use https://github.com/eclipse/lsp4j under the hood

Bot

- in `bot` folder