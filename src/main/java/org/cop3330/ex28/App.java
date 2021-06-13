package org.cop3330.ex28;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];

        // If I need a flowchart to do this, I shouldn't be in this class
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            nums[i] = in.nextInt();
        }

        Sum s = new Sum(nums);
        System.out.println(s);
    }
}
