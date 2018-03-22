# HCL

HashiCorp Configuration Language + HashiCorp Interpolation Language

- [v2](https://github.com/hashicorp/hcl2) contains [HIL](https://github.com/hashicorp/hil)
- https://github.com/hashicorp/hcl2/blob/master/hcl/spec.md
- really feels like php in some sense
  - but if a config language can have function, expression, template ... a php like look is hard to avoid

## Syntax

- https://github.com/hashicorp/hcl2/blob/master/hcl/hclsyntax/spec.md
- `${a.b.c}` is used for string interpolation in HIL
  - has some template language ish features
- use `{}` as blocks, and allow using space to nest objects
- Attribute values can be **expressions** as well as just literal values


````
io_mode = "async"

service "http" "web_proxy" {
  listen_addr = "127.0.0.1:8080"
  
  process "main" {
    command = ["/usr/local/bin/awesome-app", "server"]
  }

  process "mgmt" {
    command = ["/usr/local/bin/awesome-app", "mgmt"]
  }
}

# Arithmetic with literals and application-provided variables
sum = 1 + addend

# String interpolation and templates
message = "Hello, ${name}!"

# Application-provided functions
shouty_message = upper(message)
````

is equal to JSON

````
{
  "io_mode": "async",
  "service": {
    "http": {
      "web_proxy": {
        "listen_addr": "127.0.0.1:8080",
        "process": {
          "main": {
            "command": ["/usr/local/bin/awesome-app", "server"]
          },
          "mgmt": {
            "command": ["/usr/local/bin/awesome-app", "mgmt"]
          },
        }
      }
    }
  }
}
````

## Type

- https://github.com/hashicorp/hcl2/blob/master/hcl/spec.md#values-and-value-types
  - The result of expression evaluation is a value. Each value has a type, which is dynamically determined during evaluation. The variable scope in the evaluation context is a map from variable name to value, using the same definition of value.
- it provides type conversion like `string` <-> `number`, `string` <-> `bool`
- it also has unification to try to find the most general one when doing those conversion 
