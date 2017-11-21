# OCaml

https://realworldocaml.org/v1/en/html/a-guided-tour.html#refs

- reference is explicitly specified
- use `!` to de reference
- use `:=` for assignment

````
# let x = ref 0  (* create a ref, i.e., { contents = 0 } *) ;;
val x : int ref = {contents = 0}
# !x             (* get the contents of a ref, i.e., x.contents *) ;;
- : int = 0
# x := !x + 1    (* assignment, i.e., x.contents <- ... *) ;;
- : unit = ()
# !x ;;
- : int = 1
````