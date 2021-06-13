package org.cop3330.ex33;

public class RandomSelector {
    private Object[] options;

    public RandomSelector(Object[] options) {
        this.options = options;
    }

    public Object selectRandom() {
        int low = 0;
        int high = options.length - 1;
        int index = (int) (Math.random() * (high - low + 1) + low);

        return options[index];
    }
}
