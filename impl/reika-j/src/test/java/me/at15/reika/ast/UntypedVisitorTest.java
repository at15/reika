package me.at15.reika.ast;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import me.at15.reika.common.ReikaException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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

}
