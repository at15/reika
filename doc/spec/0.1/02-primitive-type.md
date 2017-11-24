# Revision 02

## Types

- [ ] TODO: symbol and string
- [ ] TODO: negative values
  - could consider make it an operator https://github.com/antlr/grammars-v4/issues/212

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

- [ ] `-` what should it be?, and we didn't add sign for numbers

Infix

- `+, -, *, /`
- `random_from`

````reika
1 + 1; // 2
2 * 1 + 3; // 5
[1 2 3] + [2 3 4]
5 random_from [1 2 3]
````

## Example