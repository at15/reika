package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;

import me.at15.reika.type.Primitive;
import me.at15.reika.type.Unspecified;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("fast")
public class UntypedVisitorTest {
    @Test
    @Tag("arith")
    @DisplayName("value only")
    void arithValueOnly() throws ReikaException {
        assertNotNull(ASTUtil.readResource("arith/value_only"));
    }

    @Test
    @Tag("arith")
    @DisplayName("negative")
    void arithPrecedence() throws ReikaException {
        Program root = (Program) ASTUtil.readResource("arith/negative_precedence");
        assertEquals(3, root.terms.size());
        // -1 + 2 - 3;
        OpBinary t1 = (OpBinary) root.terms.get(0);
        assertEquals(OpBinary.Op.Minus, t1.op);
        assertEquals(3, ((Val.Int) t1.r).v);
        OpBinary t1l = (OpBinary) t1.l;
        OpUnary t1ll = (OpUnary) t1l.l;
        assertEquals(OpUnary.Op.Negative, t1ll.op);
        assertEquals(1, ((Val.Int) t1ll.arg).v);
        // 1 + 2 * 3;
        OpBinary t2 = (OpBinary) root.terms.get(1);
        assertEquals(1, ((Val.Int) t2.l).v);
        OpBinary t2r = (OpBinary) t2.r;
        assertEquals(OpBinary.Op.Mul, t2r.op);
        assertEquals(2, ((Val.Int) t2r.l).v);
        assertEquals(3, ((Val.Int) t2r.r).v);
        // (1 + 2) * 3;
        OpBinary t3 = (OpBinary) root.terms.get(2);
        assertEquals(3, ((Val.Int) t3.r).v);
        OpBinary t3l = (OpBinary) t3.l;
        assertEquals(1, ((Val.Int) t3l.l).v);
        assertEquals(2, ((Val.Int) t3l.r).v);
    }

    @Test
    @Tag("arith_typed")
    @DisplayName("explicit typed")
    void arithTypedExplicit() throws ReikaException {
        Program root = (Program) ASTUtil.readResource("arith_typed/explicit");
        for (Node t : root.terms) {
            Let l = (Let) t;
            assertFalse(l.varType.v instanceof Unspecified);
        }
    }

    @Test
    @Tag("arith_typed")
    @DisplayName("implicit")
    void arithTypedImplicit() throws ReikaException {
        Program root = (Program) ASTUtil.readResource("arith_typed/implicit");
        for (Node t : root.terms) {
            Let l = (Let) t;
            assertTrue(l.varType.v instanceof Unspecified);
        }
    }

    @Test
    @Tag("arith_typed")
    @DisplayName("mixed")
    void arithTypedMixed() throws ReikaException {
        Program root = (Program) ASTUtil.readResource("arith_typed/mixed");
        Let t1 = (Let) root.terms.get(0);
//        System.out.println(t1.varType.varType.getClass());
        assertTrue(t1.varType.v instanceof Primitive.Int);
        Let t2 = (Let) root.terms.get(1);
        assertTrue(t2.varType.v instanceof Unspecified);
    }
}
