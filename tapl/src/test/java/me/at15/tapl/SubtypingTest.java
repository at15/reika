package me.at15.tapl;

import org.junit.Test;

import java.util.*;

public class SubtypingTest {
    public void UpCast(HashSet<String> hs) {
        Set<String> s = hs;
    }

    public void DownCast(Set<String> s) {
        HashSet<String> hs = (HashSet<String>) s;
    }

    @Test
    public void testUpCast() {
        UpCast(new HashSet<>());
    }

    @Test
    public void testDownCast() {
        HashSet<String> hs = new HashSet<>();
        DownCast(hs);
    }

    @Test
    public void testDownCast2() {
        Set<String> s = new TreeSet<>();
        DownCast(s);
    }
}
