package org.cop3330.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthsCalculatorTest {
    MonthsCalculator mcOne = new MonthsCalculator(5000, 12, 100);
    MonthsCalculator mcTwo = new MonthsCalculator(500000, 15, 10000);

    @Test
    void calculateMonthsReturnsCorrectValues() {
        assertEquals(mcOne.calculateMonths(), 70);
        assertEquals(mcTwo.calculateMonths(), 79);
    }

    @Test
    void testToString() {
        assertEquals(mcOne.toString(), "It will take you 70 months to pay off this card.");
        assertEquals(mcTwo.toString(), "It will take you 79 months to pay off this card.");
    }
}