package org.cop3330.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateValidatorTest {
    // Invalids
    RateValidator rv1 = new RateValidator();
    RateValidator rv2 = new RateValidator();

    // Valid
    RateValidator rv3 = new RateValidator();
    RateValidator rv4 = new RateValidator();
    RateValidator rv5 = new RateValidator();

    @Test
    void isValidReturnsExpectedValue() {
        rv1.setRate("0");
        rv2.setRate("ABC");
        rv3.setRate("4");
        assertFalse(rv1.isValid());
        assertFalse(rv2.isValid());
        assertTrue(rv3.isValid());
    }

    @Test
    void calculateYears() {
        rv3.setRate("4");
        rv4.setRate("700");
        rv5.setRate("48");
        rv3.isValid();
        rv4.isValid();
        rv5.isValid();
        assertEquals(rv3.calculateYears(), 18);
        assertEquals(rv4.calculateYears(), 1);
        assertEquals(rv5.calculateYears(), 2);
    }

    @Test
    void generateYearsString() {
        rv3.setRate("4");
        rv4.setRate("700");
        rv5.setRate("48");
        rv3.isValid();
        rv4.isValid();
        rv5.isValid();
        assertEquals(rv3.generateYearsString(), "It will take 18 years to double your initial investment.");
        assertEquals(rv4.generateYearsString(), "It will take 1 years to double your initial investment.");
        assertEquals(rv5.generateYearsString(), "It will take 2 years to double your initial investment.");
    }
}