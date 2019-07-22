package com.aurea.jervistest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProgramTests {
    @Test
    public void getGreeting() {
        assertEquals("Hello, world!", Program.getGreeting("world"));
    }
}
