package org.cop3330.ex24;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AnagramChecker checker = new AnagramChecker();

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String str1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = in.nextLine();

        String answer = checker.isAnagram(str1, str2) ? "anagrams" : "not anagrams";
        System.out.printf("\"%s\" and \"%s\" are %s.\n", str1, str2, answer);
    }
}
