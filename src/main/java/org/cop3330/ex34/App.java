package org.cop3330.ex34;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] employees = {
                "John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"
        };
        Scanner in = new Scanner(System.in);
        RemoveList list = new RemoveList(employees);
        System.out.println(list);
        System.out.println();

        System.out.print("Enter an employee name to remove: ");
        String toRemove = in.nextLine();
        list.remove(toRemove);

        System.out.println();
        System.out.println(list);
    }
}
