package org.cop3330.ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String next = "";
        while (!next.equals("done")) {
            System.out.print("Enter a number: ");
            next = in.nextLine();
            if (next.equals("done"))
                continue;

            int nextNum;
            try {
                nextNum = Integer.parseInt(next);
            } catch (Exception e) {
                System.out.println("Invalid!");
                continue;
            }
            numbers.add(nextNum);
        }

        // I wanted to make this more OO but the constraints
        // basically says not to
        Statistics stats = new Statistics(numbers);
        System.out.println(stats);
    }
}
