package org.cop3330.ex27;

public class IdField extends Field {
    public IdField(String name, String value) {
        super(name, value);
    }

    private boolean isCharAlpha(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
    private boolean isCharNumeric(char c) {
        return (c >= '1' && c <= '9');
    }

    @Override
    public boolean isValid() {
        String spacing = "\n";
        if (super.isValid()) {
            errorMessage = "";
            spacing = "";
        }
        errorMessage = "The employee ID must be in the format of AA-1234." + spacing + errorMessage;
        if (value.length() != 7)
            return false;

        for (int i = 0; i < 2; i++) {
            if (!isCharAlpha(value.charAt(i)))
                return false;
        }
        if (value.charAt(2) != '-')
            return false;

        for (int i = 3; i < 7; i++) {
            if (!isCharNumeric(value.charAt(i)))
                return false;
        }

        return true;
    }
}
