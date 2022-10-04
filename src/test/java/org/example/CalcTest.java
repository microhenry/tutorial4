package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    void testAddition() {
        Calc c = new Calc();
        assertEquals(4, c.add(2,2));
    }
    @Test
    void testSubtract() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4,2));
    }
}
