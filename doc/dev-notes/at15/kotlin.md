# Kotlin

## Basic Syntax

- https://kotlinlang.org/docs/reference/basic-syntax.html
- can compute type (don't know how much it can infer, i.e. no type hint for function)
- Unit
- `val` for immutable, can compute based on rhs `val a: Int = 1`, `val b = 2`
- `var` for mutable
- add `?` if return value can be `null`
- type check has automatic casts 

````
fun sum(a: Int, b: Int): Int { return a + b }
fun sum(a: Int, b: Int) = a + b
fun printSum(a: Int, b: Int): Unit {}
fun parseInt(str: String): Int? {}
fun getStrLen(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
````

## Functions

https://kotlinlang.org/docs/reference/functions.html

- 
- tailrec