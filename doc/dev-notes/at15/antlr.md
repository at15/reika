# ANTLR

The Definitive ANTLR 4 Reference

- P69 core notation, `?, *, +, |`
- P70 common patterns
- P71-73 precedence, associativity and left recursion
- P80-81 lexer starter kit
- [ ] P216 Python new line (no more `;`)

Language Implementation Patterns

- P21 2.2 LL Recursive Descent Parser
- P25 2.3 Tokenize
  - group character into tokens, so parser rules can be more generic `x > 1` vs. `ID > NUM`
  - lexer takes in characters and generate tokens
  - parser takes in tokens and generate parse tree

## Grammar file

- Ucfirst is token (lexer), lower case is rule (parser)
  - [ ] this is mentioned in book or doc