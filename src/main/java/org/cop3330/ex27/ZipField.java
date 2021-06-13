package org.cop3330.ex27;

public class ZipField extends Field {
    public ZipField(String name, String value) {
        super(name, value);
    }

    @Override
    public boolean isValid() {
        String spacing = "\n";
        if (super.isValid()) {
            errorMessage = "";
            spacing = "";
        }

        errorMessage = "The zipcode must be a 5 digit number." + spacing + errorMessage;

        int zipcode;
        try {
            zipcode = Integer.parseInt(value);
        } catch (Exception e) {
            return false;
        }

        return (zipcode >= 10000 && zipcode <= 99999);
    }
}
