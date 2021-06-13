package org.cop3330.ex29;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RateValidator rv = new RateValidator();

        do {
            System.out.print("What is the rate of return? ");
            String rateOfReturn = in.nextLine();
            rv.setRate(rateOfReturn);
            if (!rv.isValid())
                System.out.println("Sorry. That's not a valid input.");
        } while (!rv.isValid());

        System.out.println(rv.generateYearsString());
    }
}
