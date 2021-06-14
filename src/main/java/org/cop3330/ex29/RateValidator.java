package org.cop3330.ex29;

public class RateValidator {
    private String rateOfReturn;
    private double numericRate;

    public void setRate(String rateOfReturn) {
        this.rateOfReturn = rateOfReturn;
    }
    public boolean isValid() {
        double rate;

        try {
            rate = Double.parseDouble(rateOfReturn);
        } catch (Exception e) {
            return false;
        }

        if (rate == 0)
            return false;

        numericRate = rate;
        return true;
    }

    public int calculateYears() {
        return (int) Math.ceil(72 / numericRate);
    }

    public String generateYearsString() {
        int years = calculateYears();
        return String.format("It will take %d years to double your initial investment.", years);
    }
}
