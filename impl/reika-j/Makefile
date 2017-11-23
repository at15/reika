VERSION=0.0.1-SNAPSHOT
BUILT_JAR=./build/libs/reika-$(VERSION).jar
ANTLR_JAR=./third_party/antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
GRUN=java -cp $(ANTLR_JAR):$(BUILT_JAR) org.antlr.v4.gui.TestRig

.PHONY: gen
gen:
	gradle genReika
	gradle build

.PHONY: visual
visual:
	$(GRUN) me.at15.reika.parser.Reika prog -gui