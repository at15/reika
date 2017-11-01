ANTLR_JAR=./third_party/antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
BUILT_JAR=./build/libs/tapl-0.0.1-SNAPSHOT.jar
GRUN=java -cp $(ANTLR_JAR):$(BUILT_JAR) org.antlr.v4.gui.TestRig

.PHONY: arith-visual
arith-visual:
	$(GRUN) me.at15.tapl.arith.Arith prog -gui