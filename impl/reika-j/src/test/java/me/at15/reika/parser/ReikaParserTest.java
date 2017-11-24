package me.at15.reika.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.antlr.v4.runtime.tree.ParseTree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.io.IOException;

@Tag("fast")
public class ReikaParserTest {
    @Test
    @DisplayName("arith value only")
    void arithValueOnly() throws IOException {
        Wrapper wrapper = Util.readResource("arith/value_only", true);
        ReikaParser parser = wrapper.getParser();
        ParseTree tree = parser.prog();
        assertNotNull(tree);
        assertFalse(wrapper.hasError());
    }
}
