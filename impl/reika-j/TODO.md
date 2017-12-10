# TODO

A single file to record current status

Tooling

- [ ] profiler
  - [ ] use guava stopwatch to count time
  - [ ] use ManagementFactory to get info about gc etc.
- [ ] setting
  - [ ] debug flag, log level (config log4j ...)
  - [ ] enable profiler, and how much... TODO: can jcommand support -YXXX stuff like that, so we don't need to add them one by one
    - 22. Dynamic parameters
- [ ] benchmark
  - [ ] jmh https://github.com/melix/jmh-gradle-plugin
  
Compiler

- [ ] add symbol table and scope following previous ANTLR note
- [ ] add syntax for file, distinguish it with REPL input, may need to modify source as well, or just add a `isFile`
  - [ ] might add concept of package, so we can write standard library easier
- [ ] negative number (it is not handled properly for now in UntypedVisitor)

Function

- [ ] add function to syntax
- [ ] add built in function to accept user input (from command line)

Container

- [ ] list, might allow category list, boolean list as subtype of list etc.

Runtime

- [ ] graph need to be handled in browser instead of in pure Java, we need a websocket server