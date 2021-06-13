package org.cop3330.ex27;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Form form = new Form();

        System.out.print("Enter the first name: ");
        String fName = in.nextLine();
        form.addField("first name", fName);

        System.out.print("Enter the last name: ");
        String lName = in.nextLine();
        form.addField("last name", lName);

        System.out.print("Enter the ZIP code: ");
        String zipCode = in.nextLine();
        form.addField("zipcode", zipCode);

        System.out.print("Enter the employee ID: ");
        String employeeID = in.nextLine();
        form.addField("employee ID", employeeID);

        System.out.println(form.validateInput());
    }
}
