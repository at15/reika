ANTLR=java -Xmx500M -cp ./antlr-4.7-complete.jar org.antlr.v4.Tool
GRUN=java -cp .:./antlr-4.7-complete.jar org.antlr.v4.gui.TestRig
JC=javac -cp ./antlr-4.7-complete.jar

.PHONY: download
download:
	wget http://www.antlr.org/download/antlr-4.7-complete.jar
	wget https://services.gradle.org/distributions/gradle-4.3-all.zip
.PHONY: hello	
hello:
	$(ANTLR) Hello.g4
	$(JC) *.java
	$(ANTLR) -Dlanguage=JavaScript Hello.g4
	$(ANTLR) -Dlanguage=Python3 Hello.g4
.PHONY: hello-visual
hello-visual:
	$(GRUN) Hello r -gui