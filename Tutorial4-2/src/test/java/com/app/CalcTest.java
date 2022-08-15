package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest
{

@Test
void testSubtract() {
 Calc c = new Calc();
 assertEquals(3, c.add(2,2));
}


}
