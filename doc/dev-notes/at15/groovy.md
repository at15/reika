# Groovy

- https://github.com/apache/groovy/blob/master/src/spec/doc/type-checking-extensions.adoc
  - fail early

org/codehaus/groovy/ast

- [VariableScope](https://github.com/apache/groovy/blob/master/src/main/org/codehaus/groovy/ast/VariableScope.java#L118)
  - linked hashmap (keep order of insertion)
- [ASTNode](https://github.com/apache/groovy/blob/master/src/main/org/codehaus/groovy/ast/ASTNode.java)
  - lineNumber, columnNumber
  - lastLineNumber, lastColumnNumber
- AnnotatedNode
  - synthetic, if the node is added by compiler
- org/codehaus/groovy/ast/expr
  - Expression
    - private ClassNode type
  - ConstantExpression, use Object to store value, use instance of to set type in constructor
    - type is cached in ClassHelper by calling makeCached
- has statements, like ExpressionStatement (function call etc.) If, For etc.
