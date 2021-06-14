package org.cop3330.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    ArrayList<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    Statistics s1 = new Statistics(nums1);
    ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(100, 200, 1000, 300));
    Statistics s2 = new Statistics(nums2);
    ArrayList<Integer> nums3 = new ArrayList<Integer>(Arrays.asList(-5, 700, 8, -21));
    Statistics s3 = new Statistics(nums3);

    @Test
    void testAverage() {
        assertEquals(s1.average(nums1), 4.5);
        assertEquals(s2.average(nums2), 400);
        assertEquals(s3.average(nums3), 170.5);
    }

    @Test
    void min() {
        assertEquals(s1.min(nums1), 1);
        assertEquals(s2.min(nums2), 100);
        assertEquals(s3.min(nums3), -21);
    }

    @Test
    void max() {
        assertEquals(s1.max(nums1), 8);
        assertEquals(s2.max(nums2), 1000);
        assertEquals(s3.max(nums3), 700);
    }

    @Test
    void standardDeviation() {
        assertEquals(s1.standardDeviation(nums1), 2.29128784747792);
        assertEquals(s2.standardDeviation(nums2), 353.5533905932738);
        assertEquals(s3.standardDeviation(nums3), 305.8794697262306);
    }

    @Test
    void testToString() {
        assertEquals(s1.toString(), "Numbers: 1, 2, 3, 4, 5, 6, 7, 8\n" +
                "The average is 4.50\n" +
                "The minimum is 1\n" +
                "The maximum is 8\n" +
                "The standard deviation is 2.29\n");

        assertEquals(s2.toString(), "Numbers: 100, 200, 1000, 300\n" +
                "The average is 400.00\n" +
                "The minimum is 100\n" +
                "The maximum is 1000\n" +
                "The standard deviation is 353.55\n");
        assertEquals(s3.toString(), "Numbers: -5, 700, 8, -21\n" +
                "The average is 170.50\n" +
                "The minimum is -21\n" +
                "The maximum is 700\n" +
                "The standard deviation is 305.88\n");
    }
}