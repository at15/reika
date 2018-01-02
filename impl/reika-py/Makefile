ANTLR_JAR=./third_party/antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
GRUN=java -cp $(ANTLR_JAR):$(BUILT_JAR) org.antlr.v4.gui.TestRig
# NOTE: no use passing package, python does not declare package in file
GEN_PARSER=java -cp $(ANTLR_JAR) -Xmx500M org.antlr.v4.Tool -Dlanguage=Python3 -visitor -no-listener -Werror

all: test

.PHONY: build
build:
	@echo noop

.PHONY: release
release:
	@echo noop

.PHONY: test
test:
	@echo noop

.PHONY: gen
gen:
	@echo noop

.PHONY: gen-rcl
gen-rcl:
	$(GEN_PARSER) reika/rcl/parser/RCL.g4

.PHONY: visual
visual:
	@echo noop

.PHONY: loc
loc:
	cloc --exclude-dir=third_party,.idea,build .