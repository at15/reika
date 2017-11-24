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

- [ ] avoid duplicate logic in ASTBuilder like we did before
- `+, -, *, /`
- `random_from`

````reika
1 + 1; // 2
2 * 1 + 3; // 5
[1 2 3] + [2 3 4]
5 random_from [1 2 3]
````

## Example