# Revision 02

## Types

- [ ] TODO: symbol and string
- [ ] TODO: avoid mixed type list (in parser or when building ast?)
- negative number is defined using unary operator in parser, instead of put the `-` into lexer

````reika
1;
1.0;
true;
false;
[1 2 3]; // [Int]
{a:123 b:12.3}; // {a:Int b:Float}
{a:[1 2 3] b:12}; // {a:[Int] b:Float}
````

## Operators

- all Q's operators are right associative, which makes arith operations counter intuitive, we won't do that
  - `2 * 1 + 3` is 8 instead of 5

Unary

- [ ] `-`

Infix

- [x] avoid duplicate logic in ASTBuilder like we did before [#22](https://github.com/at15/reika/issues/22)
- `+, -, *, /`
- `random_from`

````reika
1 + 1; // 2
2 * 1 + 3; // 5
[1 2 3] + [2 3 4]
5 random_from [1 2 3]
````

Overloading

- could be implemented as syntax sugar, since we only allow built in operators
  - [PEP 443 Single-dispatch generic functions](https://www.python.org/dev/peps/pep-0443/)
    - Python has always provided a variety of built-in and standard-library generic functions, such as len(), iter()
    - does not have a simple or straightforward way for developers to create new generic function
    - In addition, it is currently a common anti-pattern for Python code to inspect the types of received arguments, in order to decide what to do with the objects

## Variable

- start with smaller case
- no mutable variable, for now, it depends on how the interpreter/compiler implement stuff
- as long as the data size is small, it should work ....

````
x = 1
y = x + 1
let z:Double = x + 1
````

## Type

- start with upper case

## Example
