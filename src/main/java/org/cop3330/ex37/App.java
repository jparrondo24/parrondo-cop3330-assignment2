package org.cop3330.ex37;

import org.cop3330.ex25.PasswordValidator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int minLength = in.nextInt();
        System.out.print("How many special characters? ");
        int specialCharacters = in.nextInt();
        System.out.print("How many numbers? ");
        int numbers = in.nextInt();
        int letters = minLength - (specialCharacters + numbers);

        if (letters < specialCharacters + numbers) {
            System.out.println("There should be at least as many letters as there are special characters and number");
            return;
        }
        PasswordGenerator pg = new PasswordGenerator(minLength, specialCharacters, numbers);
        System.out.println(pg);
    }
}
