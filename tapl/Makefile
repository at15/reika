ANTLR_JAR=./third_party/antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
BUILT_JAR=./build/libs/tapl-0.0.1-SNAPSHOT.jar
GRUN=java -cp $(ANTLR_JAR):$(BUILT_JAR) org.antlr.v4.gui.TestRig

#---- Arith -----
.PHONY: arith-gen
arith-gen:
	gradle genArith
	gradle build

.PHONY: arith-visual
arith-visual:
	$(GRUN) me.at15.tapl.arith.Arith prog -gui
#---- Arith -----

#---- Untyped ----
.PHONY: untyped-gen
untyped-gen:
	gradle genUntyped
	gradle build

.PHONY: untyped-visual
untyped-visual:
	$(GRUN) me.at15.tapl.untyped.Untyped prog -gui
#---- Untyped ----

#---- Simplebool ----
.PHONY: simplebool-gen
simplebool-gen:
	gradle genSimplebool
	gradle build
.PHONY: simplebool-visual
simplebool-visual:
	$(GRUN) me.at15.tapl.simplebool.Sb prog -gui
#---- Simplebool ----