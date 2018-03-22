// Generated from reika/rcl/parser/RCL.g4 by ANTLR 4.7
// jshint ignore: start
var antlr4 = require('antlr4/index');
var RCLVisitor = require('./RCLVisitor').RCLVisitor;

var grammarFileName = "RCL.g4";

var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u0010@\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0003\u0002\u0006\u0002",
    "\u000e\n\u0002\r\u0002\u000e\u0002\u000f\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0018\n\u0003",
    "\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u001e\n",
    "\u0004\f\u0004\u000e\u0004!\u000b\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0005\u0004\'\n\u0004\u0003\u0005\u0003\u0005\u0003",
    "\u0005\u0003\u0005\u0007\u0005-\n\u0005\f\u0005\u000e\u00050\u000b\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u00056\n\u0005",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0005\u0006>\n\u0006\u0003\u0006\u0002\u0002\u0007\u0002\u0004\u0006",
    "\b\n\u0002\u0002\u0002E\u0002\r\u0003\u0002\u0002\u0002\u0004\u0017",
    "\u0003\u0002\u0002\u0002\u0006&\u0003\u0002\u0002\u0002\b5\u0003\u0002",
    "\u0002\u0002\n=\u0003\u0002\u0002\u0002\f\u000e\u0005\u0004\u0003\u0002",
    "\r\f\u0003\u0002\u0002\u0002\u000e\u000f\u0003\u0002\u0002\u0002\u000f",
    "\r\u0003\u0002\u0002\u0002\u000f\u0010\u0003\u0002\u0002\u0002\u0010",
    "\u0003\u0003\u0002\u0002\u0002\u0011\u0012\u0007\r\u0002\u0002\u0012",
    "\u0013\u0007\u0003\u0002\u0002\u0013\u0018\u0005\n\u0006\u0002\u0014",
    "\u0015\u0007\f\u0002\u0002\u0015\u0016\u0007\u0003\u0002\u0002\u0016",
    "\u0018\u0005\n\u0006\u0002\u0017\u0011\u0003\u0002\u0002\u0002\u0017",
    "\u0014\u0003\u0002\u0002\u0002\u0018\u0005\u0003\u0002\u0002\u0002\u0019",
    "\u001a\u0007\u0004\u0002\u0002\u001a\u001f\u0005\u0004\u0003\u0002\u001b",
    "\u001c\u0007\u0005\u0002\u0002\u001c\u001e\u0005\u0004\u0003\u0002\u001d",
    "\u001b\u0003\u0002\u0002\u0002\u001e!\u0003\u0002\u0002\u0002\u001f",
    "\u001d\u0003\u0002\u0002\u0002\u001f \u0003\u0002\u0002\u0002 \"\u0003",
    "\u0002\u0002\u0002!\u001f\u0003\u0002\u0002\u0002\"#\u0007\u0006\u0002",
    "\u0002#\'\u0003\u0002\u0002\u0002$%\u0007\u0004\u0002\u0002%\'\u0007",
    "\u0006\u0002\u0002&\u0019\u0003\u0002\u0002\u0002&$\u0003\u0002\u0002",
    "\u0002\'\u0007\u0003\u0002\u0002\u0002()\u0007\u0007\u0002\u0002).\u0005",
    "\n\u0006\u0002*+\u0007\u0005\u0002\u0002+-\u0005\n\u0006\u0002,*\u0003",
    "\u0002\u0002\u0002-0\u0003\u0002\u0002\u0002.,\u0003\u0002\u0002\u0002",
    "./\u0003\u0002\u0002\u0002/1\u0003\u0002\u0002\u00020.\u0003\u0002\u0002",
    "\u000212\u0007\b\u0002\u000226\u0003\u0002\u0002\u000234\u0007\u0007",
    "\u0002\u000246\u0007\b\u0002\u00025(\u0003\u0002\u0002\u000253\u0003",
    "\u0002\u0002\u00026\t\u0003\u0002\u0002\u00027>\u0007\t\u0002\u0002",
    "8>\u0007\n\u0002\u00029>\u0007\u000b\u0002\u0002:>\u0007\f\u0002\u0002",
    ";>\u0005\u0006\u0004\u0002<>\u0005\b\u0005\u0002=7\u0003\u0002\u0002",
    "\u0002=8\u0003\u0002\u0002\u0002=9\u0003\u0002\u0002\u0002=:\u0003\u0002",
    "\u0002\u0002=;\u0003\u0002\u0002\u0002=<\u0003\u0002\u0002\u0002>\u000b",
    "\u0003\u0002\u0002\u0002\t\u000f\u0017\u001f&.5="].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'='", "'{'", "','", "'}'", "'['", "']'" ];

var symbolicNames = [ null, null, null, null, null, null, null, "BOOL", 
                      "INT", "DOUBLE", "STRING", "ID", "WS", "BLOCK_COMMENT", 
                      "SINGLE_COMMENT" ];

var ruleNames =  [ "rcl", "pair", "obj", "array", "value" ];

function RCLParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

RCLParser.prototype = Object.create(antlr4.Parser.prototype);
RCLParser.prototype.constructor = RCLParser;

Object.defineProperty(RCLParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

RCLParser.EOF = antlr4.Token.EOF;
RCLParser.T__0 = 1;
RCLParser.T__1 = 2;
RCLParser.T__2 = 3;
RCLParser.T__3 = 4;
RCLParser.T__4 = 5;
RCLParser.T__5 = 6;
RCLParser.BOOL = 7;
RCLParser.INT = 8;
RCLParser.DOUBLE = 9;
RCLParser.STRING = 10;
RCLParser.ID = 11;
RCLParser.WS = 12;
RCLParser.BLOCK_COMMENT = 13;
RCLParser.SINGLE_COMMENT = 14;

RCLParser.RULE_rcl = 0;
RCLParser.RULE_pair = 1;
RCLParser.RULE_obj = 2;
RCLParser.RULE_array = 3;
RCLParser.RULE_value = 4;

function RclContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = RCLParser.RULE_rcl;
    return this;
}

RclContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RclContext.prototype.constructor = RclContext;

RclContext.prototype.pair = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(PairContext);
    } else {
        return this.getTypedRuleContext(PairContext,i);
    }
};

RclContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitRcl(this);
    } else {
        return visitor.visitChildren(this);
    }
};




RCLParser.RclContext = RclContext;

RCLParser.prototype.rcl = function() {

    var localctx = new RclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, RCLParser.RULE_rcl);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 11; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 10;
            this.pair();
            this.state = 13; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while(_la===RCLParser.STRING || _la===RCLParser.ID);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PairContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = RCLParser.RULE_pair;
    this.k = null; // Token
    return this;
}

PairContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PairContext.prototype.constructor = PairContext;

PairContext.prototype.value = function() {
    return this.getTypedRuleContext(ValueContext,0);
};

PairContext.prototype.ID = function() {
    return this.getToken(RCLParser.ID, 0);
};

PairContext.prototype.STRING = function() {
    return this.getToken(RCLParser.STRING, 0);
};

PairContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitPair(this);
    } else {
        return visitor.visitChildren(this);
    }
};




RCLParser.PairContext = PairContext;

RCLParser.prototype.pair = function() {

    var localctx = new PairContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, RCLParser.RULE_pair);
    try {
        this.state = 21;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case RCLParser.ID:
            this.enterOuterAlt(localctx, 1);
            this.state = 15;
            localctx.k = this.match(RCLParser.ID);
            this.state = 16;
            this.match(RCLParser.T__0);
            this.state = 17;
            this.value();
            break;
        case RCLParser.STRING:
            this.enterOuterAlt(localctx, 2);
            this.state = 18;
            localctx.k = this.match(RCLParser.STRING);
            this.state = 19;
            this.match(RCLParser.T__0);
            this.state = 20;
            this.value();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ObjContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = RCLParser.RULE_obj;
    return this;
}

ObjContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ObjContext.prototype.constructor = ObjContext;

ObjContext.prototype.pair = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(PairContext);
    } else {
        return this.getTypedRuleContext(PairContext,i);
    }
};

ObjContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitObj(this);
    } else {
        return visitor.visitChildren(this);
    }
};




RCLParser.ObjContext = ObjContext;

RCLParser.prototype.obj = function() {

    var localctx = new ObjContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, RCLParser.RULE_obj);
    var _la = 0; // Token type
    try {
        this.state = 36;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 23;
            this.match(RCLParser.T__1);
            this.state = 24;
            this.pair();
            this.state = 29;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===RCLParser.T__2) {
                this.state = 25;
                this.match(RCLParser.T__2);
                this.state = 26;
                this.pair();
                this.state = 31;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 32;
            this.match(RCLParser.T__3);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 34;
            this.match(RCLParser.T__1);
            this.state = 35;
            this.match(RCLParser.T__3);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ArrayContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = RCLParser.RULE_array;
    return this;
}

ArrayContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ArrayContext.prototype.constructor = ArrayContext;

ArrayContext.prototype.value = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ValueContext);
    } else {
        return this.getTypedRuleContext(ValueContext,i);
    }
};

ArrayContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitArray(this);
    } else {
        return visitor.visitChildren(this);
    }
};




RCLParser.ArrayContext = ArrayContext;

RCLParser.prototype.array = function() {

    var localctx = new ArrayContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, RCLParser.RULE_array);
    var _la = 0; // Token type
    try {
        this.state = 51;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 38;
            this.match(RCLParser.T__4);
            this.state = 39;
            this.value();
            this.state = 44;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===RCLParser.T__2) {
                this.state = 40;
                this.match(RCLParser.T__2);
                this.state = 41;
                this.value();
                this.state = 46;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 47;
            this.match(RCLParser.T__5);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 49;
            this.match(RCLParser.T__4);
            this.state = 50;
            this.match(RCLParser.T__5);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ValueContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = RCLParser.RULE_value;
    return this;
}

ValueContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ValueContext.prototype.constructor = ValueContext;


 
ValueContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};


function ValBoolContext(parser, ctx) {
	ValueContext.call(this, parser);
    ValueContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ValBoolContext.prototype = Object.create(ValueContext.prototype);
ValBoolContext.prototype.constructor = ValBoolContext;

RCLParser.ValBoolContext = ValBoolContext;

ValBoolContext.prototype.BOOL = function() {
    return this.getToken(RCLParser.BOOL, 0);
};
ValBoolContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitValBool(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ValObjectContext(parser, ctx) {
	ValueContext.call(this, parser);
    ValueContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ValObjectContext.prototype = Object.create(ValueContext.prototype);
ValObjectContext.prototype.constructor = ValObjectContext;

RCLParser.ValObjectContext = ValObjectContext;

ValObjectContext.prototype.obj = function() {
    return this.getTypedRuleContext(ObjContext,0);
};
ValObjectContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitValObject(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ValIntContext(parser, ctx) {
	ValueContext.call(this, parser);
    ValueContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ValIntContext.prototype = Object.create(ValueContext.prototype);
ValIntContext.prototype.constructor = ValIntContext;

RCLParser.ValIntContext = ValIntContext;

ValIntContext.prototype.INT = function() {
    return this.getToken(RCLParser.INT, 0);
};
ValIntContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitValInt(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ValStringContext(parser, ctx) {
	ValueContext.call(this, parser);
    ValueContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ValStringContext.prototype = Object.create(ValueContext.prototype);
ValStringContext.prototype.constructor = ValStringContext;

RCLParser.ValStringContext = ValStringContext;

ValStringContext.prototype.STRING = function() {
    return this.getToken(RCLParser.STRING, 0);
};
ValStringContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitValString(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ValDoubleContext(parser, ctx) {
	ValueContext.call(this, parser);
    ValueContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ValDoubleContext.prototype = Object.create(ValueContext.prototype);
ValDoubleContext.prototype.constructor = ValDoubleContext;

RCLParser.ValDoubleContext = ValDoubleContext;

ValDoubleContext.prototype.DOUBLE = function() {
    return this.getToken(RCLParser.DOUBLE, 0);
};
ValDoubleContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitValDouble(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ValArrayContext(parser, ctx) {
	ValueContext.call(this, parser);
    ValueContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ValArrayContext.prototype = Object.create(ValueContext.prototype);
ValArrayContext.prototype.constructor = ValArrayContext;

RCLParser.ValArrayContext = ValArrayContext;

ValArrayContext.prototype.array = function() {
    return this.getTypedRuleContext(ArrayContext,0);
};
ValArrayContext.prototype.accept = function(visitor) {
    if ( visitor instanceof RCLVisitor ) {
        return visitor.visitValArray(this);
    } else {
        return visitor.visitChildren(this);
    }
};



RCLParser.ValueContext = ValueContext;

RCLParser.prototype.value = function() {

    var localctx = new ValueContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, RCLParser.RULE_value);
    try {
        this.state = 59;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case RCLParser.BOOL:
            localctx = new ValBoolContext(this, localctx);
            this.enterOuterAlt(localctx, 1);
            this.state = 53;
            this.match(RCLParser.BOOL);
            break;
        case RCLParser.INT:
            localctx = new ValIntContext(this, localctx);
            this.enterOuterAlt(localctx, 2);
            this.state = 54;
            this.match(RCLParser.INT);
            break;
        case RCLParser.DOUBLE:
            localctx = new ValDoubleContext(this, localctx);
            this.enterOuterAlt(localctx, 3);
            this.state = 55;
            this.match(RCLParser.DOUBLE);
            break;
        case RCLParser.STRING:
            localctx = new ValStringContext(this, localctx);
            this.enterOuterAlt(localctx, 4);
            this.state = 56;
            this.match(RCLParser.STRING);
            break;
        case RCLParser.T__1:
            localctx = new ValObjectContext(this, localctx);
            this.enterOuterAlt(localctx, 5);
            this.state = 57;
            this.obj();
            break;
        case RCLParser.T__4:
            localctx = new ValArrayContext(this, localctx);
            this.enterOuterAlt(localctx, 6);
            this.state = 58;
            this.array();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.RCLParser = RCLParser;
