package org.cop3330.ex31;

public class KarvonenTable {
    private int age;
    private int restingHeartRate;

    public KarvonenTable(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    private int targetHeartRate(int intensity) {
        return (int)(((220 - age) - restingHeartRate) * (intensity / 100.0)) + restingHeartRate;
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("Resting Pulse: %d        Age: %d\n\n", age, restingHeartRate);
        output += String.format("%-13s| %-7s\n", "Intensity", "Rate");
        output += "-------------|--------\n";
        for (int percent = 55; percent <= 95; percent += 5) {
            output += String.format("%-13s| %-4sbpm\n", percent + "%", "" + targetHeartRate(percent));
        }
        return output;
    }
}
