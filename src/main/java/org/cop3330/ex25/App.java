package org.cop3330.ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your password? ");
        String password = in.nextLine();

        PasswordValidator pv = new PasswordValidator(password);

        System.out.println(pv);
    }
}
