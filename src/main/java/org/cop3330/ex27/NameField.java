package org.cop3330.ex27;

public class NameField extends Field {
    public NameField(String name, String value) {
        super(name, value);
    }

    @Override
    public boolean isValid() {
        String spacing = "\n";
        if (super.isValid()) {
            errorMessage = "";
            spacing = "";
        }
        errorMessage = String.format("The %s must be at least 2 characters long.", name) + spacing + errorMessage;
        return value.length() >= 2;
    }
}
