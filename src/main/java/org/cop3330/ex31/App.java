package org.cop3330.ex31;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.print("What is your resting heart rate? ");
        int restingHeartRate = in.nextInt();

        KarvonenTable kt = new KarvonenTable(age, restingHeartRate);
        System.out.print(kt);
    }
}
