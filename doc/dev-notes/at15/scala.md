# Scala

Based on 2.13.x c5dc46457fee0289f23ac126fcfa4c75b10bc45a

- online https://scastie.scala-lang.org/
- http://docs.scala-lang.org/overviews/reflection/symbols-trees-types.html
  - `TermTree`, i.e. method invocation is `Apply`, object instantiation is `New`
  - `TypTree`, types are explicitly specified in program source code, e.g. List[Int] is parsed as AppliedTypeTree.
    - `TypeTree` is Types constructed by the compiler (during type inference), wrapped in `TypeTree` and integrated into AST
  - `SymTree` introduce reference definitions. `ClassDef` `ValDef`
  - Typechecking with toolboxs
    - `symbol`, a symbol assigned to trees that introduce or reference definitions
    - `tpe` (the type of the tree), by default these fields are empty, but type checking fills them in
    - runtime `ToolBox.typeCheck`, compile time (using macros?) use `Context.typeCheck`
- http://www.scala-lang.org/api/2.11.6/scala-reflect/index.html#scala.reflect.api.Universe
- https://github.com/scala/scala/blob/2.13.x/src/reflect/scala/reflect/api/Trees.scala
- https://github.com/scala/scala/blob/2.13.x/src/reflect/scala/reflect/internal/Trees.scala
- has `Any` and `Nothing` & `Null` as Top and Bottom
- http://docs.scala-lang.org/overviews/reflection/annotations-names-scopes.html
  - A scope object generally maps names to symbols available in a corresponding lexical scope
- A Deep Dive into Scalac https://www.youtube.com/watch?v=2742pWdUm6c
- https://www.scala-lang.org/files/archive/spec/2.12/13-syntax-summary.html
  - `literal ::= ['-'] integerLiteral`

compiler/scala/tools/nsc/typechcker

- https://github.com/scala/scala/blob/2.13.x/src/compiler/scala/tools/nsc/typechecker/Contexts.scala#L451
  - [ ] L185 Context, tree, symbol, scope

reflect/scala/reflect/api & internal

- API https://github.com/scala/scala/blob/2.13.x/src/reflect/scala/reflect/api/Trees.scala
- Impl https://github.com/scala/scala/blob/2.13.x/src/reflect/scala/reflect/internal/Scopes.scala
- Impl https://github.com/scala/scala/blob/2.13.x/src/reflect/scala/reflect/internal/Trees.scala

ValDef

````
  /** A common base class for ValDefs and DefDefs.
   *  @group Trees
   *  @template
   */
  type ValOrDefDef >: Null <: ValOrDefDefApi with MemberDef

  /** The API that all val defs and def defs support
   *  @group API
   */
  trait ValOrDefDefApi extends MemberDefApi { this: ValOrDefDef =>
    /** @inheritdoc */
    def name: TermName

    /** The type ascribed to the definition.
     *  An empty `TypeTree` if the type hasn't been specified explicitly
     *  and is supposed to be inferred.
     */
    def tpt: Tree

    /** The body of the definition.
     *  The `EmptyTree` is the body is empty (e.g. for abstract members).
     */
    def rhs: Tree
  }
````

Assign

````
  trait AssignApi extends TermTreeApi { this: Assign =>
    /** The left-hand side of the assignment.
     */
    def lhs: Tree

    /** The right-hand side of the assignment.
     */
    def rhs: Tree
  }
````

Ident

````
  trait IdentApi extends RefTreeApi { this: Ident =>
    /** Was this ident created from a backquoted identifier? */
    def isBackquoted: Boolean

    /** @inheritdoc */
    def name: Name
  }

````

Literal

````
  trait LiteralApi extends TermTreeApi { this: Literal =>
    /** The compile-time constant underlying the literal. */
    def value: Constant
  }
````

Constant

````
  /** The API of [[Constant]] instances.
   *  @group API
   */
  abstract class ConstantApi {
    /** Payload of the constant, that can be accessed directly or pattern matched against. */
    val value: Any

    /** Scala type that describes the constant. It is generated automatically based on the type of the value. */
    def tpe: Type
  }
````

Symbol

- anything you can define and can give a name to in Scala has an associated symbol
- certain types of tree nodes such as Ident (x) and Select (foo.bar) expose method symbol to obtain the symbol that represents their declaration. During the typechecking phase, the compiler looks up the symbol based on the name and scope and set the symbol field of tree nodes
- symbol has hierachy, all symbol has a owner except NoSymbol
- https://github.com/scala/scala/blob/v2.11.6/src/reflect/scala/reflect/api/Symbols.scala

## Read Source

- https://github.com/scala/scala/blob/2.13.x/src/intellij/README.md
- `sbt intellij`
- open `src/intellij/scala.ipr` in IntelliJ

## Phases

- [phases](https://typelevel.org/scala/docs/phases.html)
- search `val phaseName` and you can find all the phases in source code ...

`compiler/scala/tools/nsc`

- `Global.scala`, the entry for compiler logic
  - L1438 `compileUnitsInternal`, pass in `fromPhase`, default is `firstPhase` L1157 from `Run`, and calls `run` on it, timer and profiler are also enabled here
  - L400 `run` calls `applyPhase` on each compilation unit, which calls `apply(unit: CompilationUnit): Unit` that is defined in all the phases
  - `Run` a run is a single execution unit, it (seems) define the components `firstPhase` based on `-Yskip` and `-Ystop`
  - `abstract class GlobalPhase(prev: Phase) extends Phase(prev)`
- `SubComponent.scala`, defines `StdPhase`, determines order etc, seems to be a wrapper around phase
  - in compiler plugin `PluginComponent.scala`, `abstract class PluginComponent extends SubComponent`
  - `abstract class StdPhase(prev: Phase) extends global.GlobalPhase(prev)`

`reflect/scala/reflect/internal`

- `Phase.scala`, defines `abstract class Phase(val prev: Phase)`
  - has prev and next
  - `def run(): Unit`
- `Reporting.scala` defines `abstract class Reporter`
  - echo, warning, error which accept `(pos: Position, msg: String)`
- `Types.scala` define `abstract class Type extends TypeApiImpl`

`compiler/scala/tools/nsc/ast/parser`

- `SyntaxAnalyzer.scala` define the the phase and `UnitParser`

`compiler/scala/tools/nsc/typechecker`

- `Analyzer.scala` contains `namer`, `typer`
  - `unit.body = typer.typed(unit.body)`
- `Namers.scala` declares methods to create symbols and to enter them into scopes
- `Typers.scala` provides methods to assign types to trees

## A Deep Dive into Scalac

https://www.youtube.com/watch?v=2742pWdUm6c

Foo.scala -> **parser** -> tree -> **namer** -> tree + symbol table -> **typer** -> typed tree + symbol table -> **tree transformation** (optimization, easier for byte code) -> typed tree + symbol table -> **icode** -> IR -> **jvm** -> Foo.class (new backend just use jvm directly)  

Patmat phase - change to if else like ?
Tail Recur, LabelDef (generated by compiler), use javap to see the generated byte code

Global.Run.compile(files: List[String])

- create list of phases
- for each phases
  - for each file, run phase
  - print debug
  - sanity check
- print any error

- def apply(unit: CompilationUnit): unit, update the tree in place and global stuff
  - CompilationUnit, a scala file
