package org.cop3330.ex26;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double APRpercent = in.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = in.nextDouble();

        MonthsCalculator mc = new MonthsCalculator(balance, APRpercent, monthlyPayment);

        System.out.println(mc);
    }
}
