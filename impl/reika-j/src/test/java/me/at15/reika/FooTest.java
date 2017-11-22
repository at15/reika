package me.at15.reika;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
public class FooTest {
    @Test
    @DisplayName("1st Junit 5 test!")
    void barTest(TestInfo info) {
        assertEquals(2, 1 + 1, "1 + 1 = 2");
        assertEquals("1st Junit 5 test!", info.getDisplayName(), "TestInfo is injected correctly");
    }
}
