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
}
