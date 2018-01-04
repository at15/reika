// Generated from reika/rcl/parser/RCL.g4 by ANTLR 4.7
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by RCLParser.

function RCLVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

RCLVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
RCLVisitor.prototype.constructor = RCLVisitor;

// Visit a parse tree produced by RCLParser#rcl.
RCLVisitor.prototype.visitRcl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#pair.
RCLVisitor.prototype.visitPair = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#obj.
RCLVisitor.prototype.visitObj = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#array.
RCLVisitor.prototype.visitArray = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#ValBool.
RCLVisitor.prototype.visitValBool = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#ValInt.
RCLVisitor.prototype.visitValInt = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#ValDouble.
RCLVisitor.prototype.visitValDouble = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#ValString.
RCLVisitor.prototype.visitValString = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#ValObject.
RCLVisitor.prototype.visitValObject = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by RCLParser#ValArray.
RCLVisitor.prototype.visitValArray = function(ctx) {
  return this.visitChildren(ctx);
};



exports.RCLVisitor = RCLVisitor;