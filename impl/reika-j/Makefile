VERSION=0.0.1-SNAPSHOT
BUILT_JAR=./build/libs/reika-$(VERSION).jar
ANTLR_JAR=./third_party/antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
GRUN=java -cp $(ANTLR_JAR):$(BUILT_JAR) org.antlr.v4.gui.TestRig
GEN_PARSER=java -cp $(ANTLR_JAR) -Xmx500M org.antlr.v4.Tool -visitor -no-listener -Werror -package

all: test

.PHONY: build
build:
	gradle build
	gradle shadowJar

.PHONY: release
release:
	gradle shadowJar

.PHONY: test
test:
	gradle test

.PHONY: gen
gen:
	$(GEN_PARSER) me.at15.reika.compiler.parser src/main/java/me/at15/reika/compiler/parser/Reika.g4

.PHONY: visual
visual:
	$(GRUN) me.at15.reika.parser.Reika prog -gui

.PHONY: loc
loc:
	cloc --exclude-dir=third_party,.idea,build .
