ANTLR_JAR=./third_party/antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
GRUN=java -cp $(ANTLR_JAR):$(BUILT_JAR) org.antlr.v4.gui.TestRig
GEN_PARSER=java -cp $(ANTLR_JAR) -Xmx500M org.antlr.v4.Tool -Dlanguage=Go -visitor -no-listener -Werror -package

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
	$(GEN_PARSER) rcl RCL.g4

.PHONY: visual
visual:
	@echo noop

.PHONY: loc
loc:
	cloc --exclude-dir=third_party,.idea,build .