# TODO

A single file to record current status

Tooling

- [ ] profiler
  - [ ] use guava stopwatch to count time
  - [ ] use ManagementFactory to get info about gc etc.
- [ ] setting
  - [ ] debug flag, log level (config log4j ...)
    - [ ] allow specify log level, not just verbose, i.e. trace
    - [x] it seems not very easy to config log level programmatically https://logging.apache.org/log4j/2.x/manual/customconfig.html
    - https://logging.apache.org/log4j/2.x/faq.html#reconfig_level_from_code
  - [ ] enable profiler, and how much... TODO: can jcommand support -YXXX stuff like that, so we don't need to add them one by one
    - jcommand 22. Dynamic parameters
- [ ] reporter
   - [x] decouple error collector and reporter
   - [ ] allow warning
   - [x] allow specify output location, so we can capture them in test and compare with expected results, use `StringWriter`
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