package org.cop3330.ex40;

import java.util.*;

public class EmployeeList {
    private List<Map<String, String>> list;

    public EmployeeList() {
        list = new ArrayList<>();
    }

    public void addEmployee(Map<String, String> e) {
        list.add(e);
    }

    private boolean employeeContainsSearchTerm(Map<String, String> employee, String term) {
        for (String val : employee.values()) {
            if (val.contains(term))
                return true;
        }
        return false;
    }

    public EmployeeList createNewListFromSearchTerm(String searchTerm) {
        EmployeeList filteredList = new EmployeeList();

        for (Map<String, String> e : list) {
            if (employeeContainsSearchTerm(e, searchTerm))
                filteredList.addEmployee(e);
        }

        return filteredList;
    }

    public void sortListByLastName() {
        Comparator<Map<String, String>> employeesComp =
                (Map<String, String> employee1, Map<String, String> employee2)
                        -> (int) (employee1.get("last_name").compareTo(employee2.get("last_name")));

        Collections.sort(list, employeesComp);
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("%-20s| %-18s| %-15s\n", "Name", "Position", "Separation Date");
        output += "--------------------|-------------------|----------------";

        for (Map<String, String> e : list) {
            output += "\n";
            output += String.format("%-20s| %-18s| %-15s",
                    e.getOrDefault("first_name", "") + " " + e.getOrDefault("last_name", ""),
                    e.getOrDefault("position", ""),
                    e.getOrDefault("separation_date", "")
            );
        }

        return output;
    }
}

