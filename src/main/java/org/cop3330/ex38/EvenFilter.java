package org.cop3330.ex38;

import java.util.ArrayList;

public class EvenFilter {
    private int[] list;

    private int[] filterEvenNumbers(int[] arr) {
        ArrayList<Integer> evensList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0)
                evensList.add(num);
        }

        int[] evensArr = new int[evensList.size()];
        for (int i = 0; i < evensArr.length; i++) {
            evensArr[i] = evensList.get(i);
        }

        return evensArr;
    }

    public EvenFilter(int[] list) {
        this.list = filterEvenNumbers(list);
    }

    @Override
    public String toString() {
        String output = "The even numbers are";
        for (int even : list)
            output += " " + even;
        output += ".";

        return output;
    }
}
