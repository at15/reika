ANTLR_JAR=./antlr-4.7-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool

.PHONY: download
download:
	wget http://www.antlr.org/download/antlr-4.7-complete.jar

.PHONY: gen
gen:
	$(ANTLR) -visitor -no-listener Arith.g4