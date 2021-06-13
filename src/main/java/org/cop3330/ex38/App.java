package org.cop3330.ex38;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String listAsString = in.nextLine();

        String[] strList = listAsString.split(" ");
        int[] list = new int[strList.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(strList[i]);
        }

        EvenFilter ef = new EvenFilter(list);
        System.out.println(ef);
    }
}
