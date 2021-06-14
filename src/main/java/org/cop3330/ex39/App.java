package org.cop3330.ex39;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
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
        list.sortListByLastName();

        System.out.println(list);
    }
}
