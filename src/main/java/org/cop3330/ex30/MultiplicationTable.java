package org.cop3330.ex30;

public class MultiplicationTable {
    @Override
    public String toString() {
        String output = "";
        for (int row = 1; row <= 12; row++) {
            for (int col = 1; col <= 12; col++) {
                output += String.format("%5d", row * col);
            }
            output += "\n";
        }
        return output;
    }
}
