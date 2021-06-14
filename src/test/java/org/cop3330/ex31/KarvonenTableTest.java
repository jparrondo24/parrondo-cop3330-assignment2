package org.cop3330.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenTableTest {
    KarvonenTable kt1 = new KarvonenTable(22, 65);
    KarvonenTable kt2 = new KarvonenTable(50, 25);

    @Test
    void testIfTargetHeartRateWorksCorrectly() {
        assertEquals(kt1.targetHeartRate(65), 151);
        assertEquals(kt2.targetHeartRate(80), 141);
    }

    @Test
    void testToString() {
        assertEquals("Resting Pulse: 65        Age: 22\n" +
                "\n" +
                "Intensity    | Rate   \n" +
                "-------------|--------\n" +
                "55%          | 138 bpm\n" +
                "60%          | 144 bpm\n" +
                "65%          | 151 bpm\n" +
                "70%          | 158 bpm\n" +
                "75%          | 164 bpm\n" +
                "80%          | 171 bpm\n" +
                "85%          | 178 bpm\n" +
                "90%          | 184 bpm\n" +
                "95%          | 191 bpm\n"
                , kt1.toString());
        assertEquals("Resting Pulse: 25        Age: 50\n" +
                "\n" +
                "Intensity    | Rate   \n" +
                "-------------|--------\n" +
                "55%          | 104 bpm\n" +
                "60%          | 112 bpm\n" +
                "65%          | 119 bpm\n" +
                "70%          | 126 bpm\n" +
                "75%          | 133 bpm\n" +
                "80%          | 141 bpm\n" +
                "85%          | 148 bpm\n" +
                "90%          | 155 bpm\n" +
                "95%          | 162 bpm\n"
                , kt2.toString());
    }
}