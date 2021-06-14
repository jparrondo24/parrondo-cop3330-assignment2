package org.cop3330.ex40;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {
    EmployeeList list = new EmployeeList();

    @Test
    void testSearchingAndThenToString() {
        list.addEmployee(Map.of(
                "first_name", "John",
                "last_name", "Johnson",
                "position", "Manager",
                "separation_date", "2016-12-31"
        ));
        list.addEmployee(Map.of(
                "first_name", "Tou",
                "last_name", "Xiong",
                "position", "Software Engineer",
                "separation_date", "2016-10-05"
        ));
        list.addEmployee(Map.of(
                "first_name", "Michaela",
                "last_name", "Michaelson",
                "position", "District Manager",
                "separation_date", "2015-12-19"
        ));
        list.addEmployee(Map.of(
                "first_name", "Jake",
                "last_name", "Jacobson",
                "position", "Programmer"
        ));
        list.addEmployee(Map.of(
                "first_name", "Jacquelyn",
                "last_name", "Jackson",
                "position", "DBA"
        ));
        list.addEmployee(Map.of(
                "first_name", "Sally",
                "last_name", "Webber",
                "position", "Web Developer",
                "separation_date", "2015-12-18"
        ));
        list = list.createNewListFromSearchTerm("Jac");
        list.sortListByLastName();
        assertEquals("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------\n" +
                "Jacquelyn Jackson   | DBA               |                \n" +
                "Jake Jacobson       | Programmer        |                ",
                 list.toString());
    }
}