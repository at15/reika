# Reika Configuration Language

## Goals

- keep position information if required, so developer can give detailed error report to user
- types: string, bool, int, float, array, object
- syntax: use brackets instead of indent

## Reference

- HCL https://github.com/hashicorp/hcl
  - http://jen20.com/2015/09/07/using-hcl-part-1.html it seems HCL expose a parse tree
  - https://www.terraform.io/docs/configuration/syntax.html
- TOML https://github.com/toml-lang/toml
  - support both bare key and quoted string in [key/value pair](https://github.com/toml-lang/toml#keyvalue-pair)
- YAML https://github.com/yaml/yaml-spec
- https://github.com/dhall-lang/dhall-lang A configuration language guaranteed to terminate
- Skylark (used by Bazel build tool) https://github.com/google/skylark

ANTLR

- JSON https://github.com/antlr/grammars-v4/blob/master/json/JSON.g4

## Example

````
name = "Xephon-K"
backends = [
  "Cassandra",
  "Local Disk"
]
oss = true
github = "https://github.com/xephonhq/xephon-k"
articles = [
  {
    name = "Introduction to Time Series Database",
    url = "https://zhuanlan.zhihu.com/p/29367404"
  }
]
````
