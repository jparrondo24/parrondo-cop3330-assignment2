package org.cop3330.ex27;

import java.util.ArrayList;

public class Form {
    private ArrayList<Field> fields;

    public Form() {
        fields = new ArrayList<Field>();
    }

    public void addField(String name, String value) {
        Field newField;

        if (name.equals("first name") || name.equals("last name"))
            newField = new NameField(name, value);
        else if (name.equals("zipcode"))
            newField = new ZipField(name, value);
        else if (name.equals("employee ID"))
            newField = new IdField(name, value);
        else
            newField = new Field(name, value);

        fields.add(newField);
    }

    public String validateInput() {
        boolean areAllValid = true;
        ArrayList<String> outputs = new ArrayList<>();

        for (Field field : fields) {
            if (!field.isValid()) {
                areAllValid = false;
                outputs.add(field.errorMessage);
            }
        }
        if (areAllValid)
            return "There were no errors found.";

        String totalOutput = "";
        for (int i = 0; i < outputs.size() - 1; i++)
            totalOutput += (outputs.get(i) + "\n");
        totalOutput += outputs.get(outputs.size() - 1);

        return totalOutput;
    }
}
