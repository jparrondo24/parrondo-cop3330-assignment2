package org.cop3330.ex27;

public class Field {
    String name;
    String value;
    String errorMessage;

    public Field(String name, String value) {
        this.name = name;
        this.value = value;
        errorMessage = String.format("The %s must be filled in.", name);
    }

    public boolean isValid() {
        return value.length() > 0;
    }
}
