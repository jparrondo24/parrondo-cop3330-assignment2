package org.cop3330.ex35;

import java.util.ArrayList;

public class RandomSelector {
    private ArrayList options;

    public RandomSelector(ArrayList options) {
        this.options = options;
    }

    public Object selectRandom() {
        int low = 0;
        int high = options.size() - 1;
        int index = (int) (Math.random() * (high - low + 1) + low);

        return options.get(index);
    }

    @Override
    public String toString() {
        return "The winner is... " + selectRandom() + ".";
    }
}
