package org.cop3330.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    int[] one = {1, 2, 3, 4, 5};
    Sum s1 = new Sum(one);
    int[] two = {-10, -11, -12, 99, 888};
    Sum s2 = new Sum(two);
    int[] three = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100};
    Sum s3 = new Sum(three);

    @Test
    void testToString() {
        assertEquals(s1.toString(), "The total is 15.");
        assertEquals(s2.toString(), "The total is 954.");
        assertEquals(s3.toString(), "The total is 166.");
    }
}