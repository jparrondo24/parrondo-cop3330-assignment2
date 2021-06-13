package org.cop3330.ex28;

// Only wrote this because I have to unit test something
public class Sum {
    private int sum;

    public Sum(int[] nums) {
        sum = 0;
        for (int num : nums)
            sum += num;
    }

    @Override
    public String toString() {
        return String.format("The total is %d.", sum);
    }
}
