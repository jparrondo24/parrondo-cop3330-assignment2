package org.cop3330.ex33;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] options = {"Yes,", "No,", "Maybe,", "Ask again later."};
        RandomSelector rs = new RandomSelector(options);

        System.out.println("What's your question?");
        System.out.print(" > ");
        in.nextLine();

        System.out.println(rs.selectRandom());
    }
}
