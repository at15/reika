package me.at15.tapl.simplebool;

public class SbTypeChecker {
    private class UnknownTypeException extends Exception {
        public UnknownTypeException(SbAst.Node node) {
            super("unknown type, can't derive type from syntax of " + node.toString());
        }
    }

    private class UnboundTypeException extends Exception {
        public UnboundTypeException(String name) {
            super("unbound variable " + name);
        }
    }

    private class ParamTypeMismatchException extends Exception {
        public ParamTypeMismatchException(SbAst.Ty sig, SbAst.Ty arg) {
            super("func is " + sig.toString() + " but got " + arg.toString());
        }
    }

    private class ConditionTypeNotBoolException extends Exception {
        public ConditionTypeNotBoolException(SbAst.Node node, SbAst.Ty type) {
            super("condition type " + node.toString() + " is not bool but " + type.toString());
        }
    }

    private class ConditionBranchTypeMismatchException extends Exception {
        public ConditionBranchTypeMismatchException(SbAst.Ty tThen, SbAst.Ty tEls) {
            super("condition branches have different types " + tThen.toString() + " " + tEls.toString());
        }
    }

    private class TypeContext {
        private TypeContext prev;
        private String name;
        private SbAst.Ty type;

        public TypeContext() {
            prev = null;
            name = "";
        }

        public TypeContext(TypeContext prev, String name, SbAst.Ty type) {
            this();
            this.prev = prev;
            this.name = name;
            this.type = type;
        }

        public SbAst.Ty Lookup(String name) throws UnboundTypeException {
            if (this.name.equals(name)) {
                return this.type;
            }
            if (prev == null) {
                throw new UnboundTypeException(name);
            }
            return prev.Lookup(name);
        }

        public TypeContext extend(String name, SbAst.Ty type) {
            return new TypeContext(this, name, type);
        }
    }


    public void checkProg(SbAst.Prog prog) {
        for (SbAst.Node node : prog.terms) {
            try {
                System.out.println(node.toString() + " : " + typeOf(node, new TypeContext()));
            } catch (UnboundTypeException | ParamTypeMismatchException
                    | ConditionTypeNotBoolException | ConditionBranchTypeMismatchException
                    | UnknownTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public SbAst.Ty typeOf(SbAst.Node node, TypeContext ctx) throws UnboundTypeException, ParamTypeMismatchException,
            ConditionTypeNotBoolException, ConditionBranchTypeMismatchException, UnknownTypeException {
        if (node instanceof SbAst.Var) {
            return ctx.Lookup(((SbAst.Var) node).name);
        } else if (node instanceof SbAst.Abs) {
            // add its argument to context
            SbAst.Abs abs = (SbAst.Abs) node;
            TypeContext newCtx = ctx.extend(abs.arg.name, abs.argType);
            // get body type based on this new context
            SbAst.Ty bodyType = typeOf(abs.body, newCtx);
            return new SbAst.TyArr(abs.argType, bodyType);
        } else if (node instanceof SbAst.App) {
            SbAst.App app = (SbAst.App) node;
            SbAst.Ty absType = typeOf(app.abs, ctx);
            SbAst.Ty argType = typeOf(app.arg, ctx);
            SbAst.TyArr absTypeArr = (SbAst.TyArr) absType;
            if (!sameType(absTypeArr.arg, argType)) {
                throw new ParamTypeMismatchException(absTypeArr, argType);
            }
            return absTypeArr.res;
        } else if (node instanceof SbAst.True) {
            return new SbAst.TyBool();
        } else if (node instanceof SbAst.False) {
            return new SbAst.TyBool();
        } else if (node instanceof SbAst.If) {
            SbAst.If ifb = (SbAst.If) node;
            SbAst.Ty conType = typeOf(ifb.con, ctx);
            if (!(conType instanceof SbAst.TyBool)) {
                throw new ConditionTypeNotBoolException(ifb.con, conType);
            }
            SbAst.Ty thenType = typeOf(ifb.then, ctx);
            SbAst.Ty elsType = typeOf(ifb.els, ctx);
            if (!sameType(thenType, elsType)) {
                throw new ConditionBranchTypeMismatchException(thenType, elsType);
            }
            return thenType;
        } else {
            throw new UnknownTypeException(node);
        }
    }

    public Boolean sameType(SbAst.Ty t1, SbAst.Ty t2) {
        if (t1 instanceof SbAst.TyBool) {
            return t2 instanceof SbAst.TyBool;
        }
        // now t1 is arrow, if they want to be same, t2 must also be arrow
        if (t2 instanceof SbAst.TyArr) {
            SbAst.TyArr t1Arr = (SbAst.TyArr) t1;
            SbAst.TyArr t2Arr = (SbAst.TyArr) t2;
            return sameType(t1Arr.arg, t2Arr.arg) && sameType(t1Arr.res, t2Arr.res);
        }
        return false;
    }
}
