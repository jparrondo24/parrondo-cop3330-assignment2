package org.cop3330.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    AnagramChecker ac = new AnagramChecker();

    @Test
    void isAnagramReturnsFalseForNonAnagrams() {
        assertFalse(ac.isAnagram("hello", "world"));
        assertFalse(ac.isAnagram("goodbye", "world"));
        assertFalse(ac.isAnagram("goodbye", "world"));
        assertFalse(ac.isAnagram("pits", "zpit"));
        assertFalse(ac.isAnagram("tipz", "spit"));
        assertFalse(ac.isAnagram("buzt", "tubs"));
    }

    @Test
    void isAnagramReturnsTrueForAnagrams() {
        assertTrue(ac.isAnagram("tire", "rite"));
        assertTrue(ac.isAnagram("pits", "spit"));
        assertTrue(ac.isAnagram("tips", "spit"));
        assertTrue(ac.isAnagram("tubs", "bust"));
    }
}