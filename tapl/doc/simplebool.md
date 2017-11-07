# Simple Bool

- Chapter 10 An ML Implementation of Simple Types

## Syntax

Pure simply typed lambda-calculus

![pure simply typed lambda calculus](p103-pure-stlc.png)

test.f for simplebool

````
 lambda x:Bool. x;
 (lambda x:Bool->Bool. if x false then true else false)
   (lambda x:Bool. if x then false else true);
````

![simplebool-parse-tree](simplebool-parse-tree.png)