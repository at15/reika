package me.at15.reika.rcl;


import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class RCLParsingTest extends RCLTestBase {
    @Test
    void parseDB() throws IOException {
        // TODO: we are still using the default error listener, which log to stderr instead of collecting errors
        ParseTree tree = getParseTreeFromResource("rcl/db.rcl");
        assertNotNull(tree);
    }
}
