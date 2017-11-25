package me.at15.reika.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.antlr.v4.runtime.tree.ParseTree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Tag("fast")
public class ReikaParserTest {
    @Test
    @Tag("arith")
    @DisplayName("value only")
    // TODO: use parameterized test, it's experimental API, we may need to use a newer JUnit5
    // http://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
    void arithValueOnly() throws IOException {
        Wrapper wrapper = ParserUtil.readResource("arith/value_only", true);
        ReikaParser parser = wrapper.getParser();
        ParseTree tree = parser.prog();
        assertNotNull(tree);
        assertFalse(wrapper.hasError());
    }
}
