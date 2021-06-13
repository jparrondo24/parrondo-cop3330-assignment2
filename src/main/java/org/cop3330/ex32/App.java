package org.cop3330.ex32;

// You and I both know this exercise was not designed to be unit tested.
// I tried my best with the DifficultyLevel class.

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    private static DifficultyLevel[] levels = new DifficultyLevel[3];

    public static void playGame() {
        System.out.println();
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int difficultyLevel = in.nextInt() - 1;
        in.nextLine();
        DifficultyLevel currDifficultyLevel = levels[difficultyLevel];

        int num = currDifficultyLevel.generateRandomNumber();
        System.out.println(num);
        System.out.print("I have my number. What's your guess? ");
        int guess = num - 1;
        int guessCount = 0;

        do {
            String strGuess = in.nextLine();
            guessCount++;

            try {
                guess = Integer.parseInt(strGuess);
            } catch (Exception e) {
                System.out.print("Too stupid. Guess again: ");
                continue;
            }

            if (guess != num)
                System.out.printf("%s. Guess again: ", guess < num ? "Too low" : "Too high");
        } while (guess != num);

        System.out.printf("You got it in %d guesses!\n\n", guessCount);
    }

    public static void main(String[] args) {
        int high = 1;
        for (int i = 0; i < 3; i++)
            levels[i] = new DifficultyLevel(1, high *= 10);

        System.out.println("Let's play Guess the Number!");
        boolean playAgain = true;
        while (playAgain) {
            playGame();

            System.out.print("Do you wish to play again (Y/N)? ");
            String intent = in.nextLine().toLowerCase();
            playAgain = intent.equals("y");
        }
    }
}
