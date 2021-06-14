package org.cop3330.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private final int VERY_WEAK = 0;
    private final int WEAK = 1;
    private final int DECENT= 2;
    private final int STRONG = 3;
    private final int VERY_STRONG = 4;

    PasswordValidator veryWeakPassword = new PasswordValidator("12345");
    PasswordValidator weakPassword = new PasswordValidator("abcdef");
    PasswordValidator decentPasswordOne = new PasswordValidator("12dfd");
    PasswordValidator decentPasswordTwo = new PasswordValidator("aaaaaaaaa");
    PasswordValidator strongPassword = new PasswordValidator("abc123xyz");
    PasswordValidator veryStrongPassword = new PasswordValidator("1337h@xor!");

    @Test
    void testGetPasswordStrengthReturnsAppropriateValues() {
        assertEquals(veryWeakPassword.getPasswordStrength(), VERY_WEAK);
        assertEquals(weakPassword.getPasswordStrength(), WEAK);
        assertEquals(decentPasswordOne.getPasswordStrength(), DECENT);
        assertEquals(decentPasswordTwo.getPasswordStrength(), DECENT);
        assertEquals(strongPassword.getPasswordStrength(), STRONG);
        assertEquals(veryStrongPassword.getPasswordStrength(), VERY_STRONG);
    }

    PasswordValidator pv = new PasswordValidator("a");

    @Test
    void testMapIntStrengthToStringReturnsRightInt() {
        assertEquals(pv.mapIntStrengthToString(VERY_WEAK), "very weak");
        assertEquals(pv.mapIntStrengthToString(WEAK), "weak");
        assertEquals(pv.mapIntStrengthToString(DECENT), "decent");
        assertEquals(pv.mapIntStrengthToString(STRONG), "strong");
        assertEquals(pv.mapIntStrengthToString(VERY_STRONG), "very strong");
    }

    @Test
    void testToString() {
        assertEquals(veryWeakPassword.toString(), "The password '12345' is a very weak password.");
        assertEquals(weakPassword.toString(), "The password 'abcdef' is a weak password.");
        assertEquals(decentPasswordOne.toString(), "The password '12dfd' is a decent password.");
        assertEquals(decentPasswordTwo.toString(), "The password 'aaaaaaaaa' is a decent password.");
        assertEquals(strongPassword.toString(), "The password 'abc123xyz' is a strong password.");
        assertEquals(veryStrongPassword.toString(), "The password '1337h@xor!' is a very strong password.");
    }
}