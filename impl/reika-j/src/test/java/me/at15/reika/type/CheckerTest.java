package me.at15.reika.type;

import me.at15.reika.common.ReikaException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("fast")
public class CheckerTest {
    @Test
    @Tag("arith")
    @DisplayName("value only")
    void arithValueOnly() throws ReikaException {
        assertNotNull(TypeUtil.readResource("arith/value_only"));
    }

    @Test
    @Tag("arith")
    @DisplayName("negative")
    void arithPrecedence() throws ReikaException {
        assertNotNull(TypeUtil.readResource("arith/negative_precedence"));
    }

    @Test
    @Tag("arith_typed")
    @DisplayName("explicit typed")
    void arithTypedExplicit() throws ReikaException {
        assertNotNull(TypeUtil.readResource("arith_typed/explicit"));
    }

    @Test
    @Tag("arith_typed")
    @DisplayName("implicit")
    void arithImplicit() throws ReikaException {
        assertNotNull(TypeUtil.readResource("arith_typed/implicit"));
    }

    @Test
    @Tag("arith_typed")
    @DisplayName("mixed")
    void arithTypedMixed() throws ReikaException {
        assertNotNull(TypeUtil.readResource("arith_typed/mixed"));
    }
}
