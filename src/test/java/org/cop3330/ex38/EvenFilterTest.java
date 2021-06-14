package org.cop3330.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenFilterTest {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    EvenFilter ef = new EvenFilter(arr);

    @Test
    void filterEvenNumbers() {
        int[] evens = {2, 4, 6, 8};
        assertArrayEquals(ef.filterEvenNumbers(arr), evens);
    }

    @Test
    void testToString() {
        assertEquals("The even numbers are 2 4 6 8.", ef.toString());
    }
}