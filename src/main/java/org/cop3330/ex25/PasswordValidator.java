package org.cop3330.ex25;

public class PasswordValidator {
    private final int VERY_WEAK = 0;
    private final int WEAK = 1;
    private final int DECENT= 2;
    private final int STRONG = 3;
    private final int VERY_STRONG = 4;

    private String password;
    private boolean containsLetters;
    private boolean containsNumbers;
    private boolean containsSpecialCharacters;

    public PasswordValidator(String password) {
        this.password = password;

        boolean containsLetters = false;
        boolean containsNumbers = false;
        boolean containsSpecialCharacters = false;

        String lowerCasePassword = password.toLowerCase();
        for (int i = 0; i < password.length(); i++) {
            char nextChar = lowerCasePassword.charAt(i);
            if (nextChar >= 'a' && nextChar <= 'z')
                containsLetters = true;
            else if (nextChar >= '0' && nextChar <= '9')
                containsNumbers = true;
            else
                containsSpecialCharacters = true;
        }

        this.containsLetters = containsLetters;
        this.containsNumbers = containsNumbers;
        this.containsSpecialCharacters = containsSpecialCharacters;
    }

    private int getPasswordStrength() {
        if (password.length() < 8) {
            if (containsNumbers && !(containsLetters || containsSpecialCharacters))
                return VERY_WEAK;
            else if (containsLetters && !(containsNumbers || containsSpecialCharacters))
                return WEAK;
            return DECENT;
        }

        if (containsLetters && containsNumbers && containsSpecialCharacters)
            return VERY_STRONG;
        else if (containsLetters && containsNumbers)
            return STRONG;

        return DECENT;
    }

    private String mapIntStrengthToString(int strength) {
        String[] strengths = {"very weak", "weak", "decent", "strong", "very strong"};
        return strengths[strength];
    }

    @Override
    public String toString() {
        int intStrength = getPasswordStrength();
        String strStrength = mapIntStrengthToString(intStrength);

        return String.format("The password '%s' is a %s password.", password, strStrength);
    }
}
