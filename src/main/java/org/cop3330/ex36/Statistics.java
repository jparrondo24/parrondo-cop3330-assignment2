package org.cop3330.ex36;

import java.util.ArrayList;

public class Statistics {
    ArrayList<Integer> nums;

    public Statistics(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    public double average(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return (double) sum / arr.size();
    }

    public int min(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    public int max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public double standardDeviation(ArrayList<Integer> arr) {
        double summation = 0;
        double average = average(arr);

        for (int num : arr)
            summation += Math.pow(num - average, 2);

        return Math.sqrt(1.0 / arr.size() * summation);
    }

    @Override
    public String toString() {
        String output = "Numbers: ";
        for (int i = 0; i < nums.size() - 1; i++) {
            output += nums.get(i) + ", ";
        }
        output += nums.get(nums.size() - 1) + "\n";
        output += String.format("The average is %.2f\n", average(nums));
        output += String.format("The minimum is %d\n", min(nums));
        output += String.format("The maximum is %d\n", max(nums));
        output += String.format("The standard deviation is %.2f\n", standardDeviation(nums));

        return output;
    }
}
