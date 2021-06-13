package org.cop3330.ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String next = "next";
        while (!next.equals("")) {
            System.out.print("Enter a name: ");
            next = in.nextLine();
            list.add(next);
        }
        list.remove(list.size() - 1);

        RandomSelector rs = new RandomSelector(list);
        System.out.println(rs);
    }
}
