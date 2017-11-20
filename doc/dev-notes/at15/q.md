# Q

- http://code.kx.com/q4m3
- https://github.com/at15/reika/issues/12

## 1. Q Shock and Ave

http://code.kx.com/q4m3/1_Q_Shock_and_Awe/

- int, float
- date (int, days since 2000)
- timespan (number of nanoseconds since midnight)
- symbol (immutable string?)
- list (ordered collection of items sequenced from left to right)
  - can have mixed type (best to avoid that) `(1; 1.2)`
  - not build using `cons` like in many fp, nor single linked list
  - homogeneous list (typo in website) of atoms is *simple list*
  - q recognizes a list of homogeneous atoms dynamically and coverts it to a simple list
  - `til`, `1+til 10` (vector processing)
  - join `,`  `1 2 3, til 5`
  - take `#`, `2#til 10`, it can also be used to replicate atom to list, `5#2`
  - indexing `L[0]`
- functions
  - built in can be used in infix, custom can only be prefix
  - `sq:{[x] x*x}`, `pyth:{[x;y] a:x*x; b:y*y; a+b}`
  - `sq[5]` or `sq 5`
- function on list
  - `/` us called `adverb`
  - `0 +/ 1 2 3 4 5`, `(+/) 1 2 3 4 5`
  - this is *declarative programming*
  - `|` returns larger of its operand, `&` returns the smaller of its operands
    - `(|/) 9 1 3 7` -> 9, `(&/) 9 1 3 7` -> 1
  - some have their name, `sum`, `prd`, `max`, `min`
- `/` takes a given function, and produce a new function that accumulate across the original list, producing a single result (map and reduce?)
- `\` is *scan* (map only? not exactly, like MPI's scan, prefix reduction?), name has `s`, like `sums`
  - `mins 20 10 40 30` -> `20 10 10 10`
  - `10 {x,sum -2#x}/ 1 1` fibonacci
- allow partial application of function
- [ ] TODO: FIFO Allocation
- dictionary
  - A dictionary is constructed from two lists of the same length using the `!` operator
- table is a flipped column dictionary, a first class entity in q
  - It is also a list of record dictionaries

> Looking at this syntactically, we might conclude that t is a list of record dictionaries. In fact it is, at least logically; physically a table is always stored as a collection of named columns

- q-sql
  - `select` template is a syntactic sugar designed to mimic SQL SELECT
  - `by` (like GROUP BY in SQL)
    - can group on a computed column `select count c2 by ovrund:c3<=40 from t`
  - `update`, update c3:10*c3 from t where c2=`a`

Example: Trades Table

- `10?20` generate 10 random number from 0 to 20, also work for list of symbol, 10?`aapl`ibm
- after construct the table, sort in in time order using `xasc`

IPC

Websocket

- also gives an example of chart

## 6. Functions

- call by name, use backslash to pass symbol http://code.kx.com/q4m3/6_Functions/#62-call-by-name

````
a:42
get `a
````

## 7. Transforming Data

http://code.kx.com/q4m3/7_Transforming_Data/

- `type` returns the type num
- there is casting

## 8 Tables

### 8.4 Primary Key and Keyed Tables

- A keyed table is a dictionary mapping a table of key records to a table of value records
- (kind of like index?)
- `([] eid:1001 1002)#kt` no longer need select
- can convert between keyed and normal table, by default create copy, use call by name (see 6. Functions) to do it in place

### 8.5 Foreign Key

- 
