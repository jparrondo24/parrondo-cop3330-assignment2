package org.cop3330.ex28;

import java.util.Scanner;

public class App {
    // Only wrote this function because I have to unit test something
    public static String generateTotalString(int[] nums) {
        int sum = 0;
        for (int num: nums)
            sum += num;
        return String.format("The total is %d.", sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];

        // If I need a flowchart to do this, I shouldn't be in this class
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            nums[i] = in.nextInt();
        }

        System.out.println(generateTotalString(nums));
    }
}
