package org.cop3330.ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveListTest {
    String[] employees = {
            "John Smith",
            "Jackie Jackson",
            "Chris Jones",
            "Amanda Cullen",
            "Jeremy Goodwin"
    };
    RemoveList list = new RemoveList(employees);
    @Test
    void testToStringRemovingAndToString() {
        assertEquals(list.toString(),
        "There are 5 employees:\n" +
                "John Smith\n" +
                "Jackie Jackson\n" +
                "Chris Jones\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin");

        list.remove("Chris Jones");
        assertEquals(list.toString(),
        "There are 4 employees:\n" +
                "John Smith\n" +
                "Jackie Jackson\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin");
    }
}