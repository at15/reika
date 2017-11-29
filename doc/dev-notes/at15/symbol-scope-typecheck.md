# Symbol, Scope, Type Check 

- Types and Type Checking http://www.cs.cornell.edu/courses/cs412/2008sp/lectures/lec17.pdf
  - P20 visitor example, we can put the symbol type as class member to avoid passing it around, just remember to update it when enter and exit certain nodes like function
- http://web.cs.iastate.edu/~weile/cs440.540/5.SemanticAnalysis.scope.pdf
  - P? The Roles of Symbol Table: once all declarations have been processed to build the symbol table, and all ID node in AST have been processed to link the corresponding symbol-table entry, then the symbol table itself is no longer needed
  - to process a declaration of x: look in first table, if there error, else declare

