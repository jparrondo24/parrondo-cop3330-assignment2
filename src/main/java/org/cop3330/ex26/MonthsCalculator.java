package org.cop3330.ex26;

public class MonthsCalculator {
    private double balance;
    private double dailyRate;
    private double monthlyPayment;
    private int months;

    private int calculateMonths() {
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / monthlyPayment * (1 - Math.pow(1 + dailyRate, 30))) / Math.log(1 + dailyRate));
    }

    public MonthsCalculator(double balance, double APRpercent, double monthlyPayment) {
        this.balance = balance;
        this.dailyRate = APRpercent / 100.0 / 365.0;
        this.monthlyPayment = monthlyPayment;
        months = calculateMonths();
    }

    public String toString() {
        return String.format("It will take you %d months to pay off this card.", months);
    }
}
