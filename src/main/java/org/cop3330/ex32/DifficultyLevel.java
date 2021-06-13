package org.cop3330.ex32;

public class DifficultyLevel {
    private int low;
    private int high;

    public DifficultyLevel(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * (high - low + 1) + low);
    }
}
