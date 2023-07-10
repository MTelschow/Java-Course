package projects.wordle;

import projects.utils.ConsoleColors;

import java.util.Arrays;
import java.util.Scanner;

public class Wordle {
    public String secretWord;
    public int attempts;

    public Wordle(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
    }

    public void play() {
        // Turn into lowercase for simplicity
        String expectedMatch = secretWord.toLowerCase();

        // Create scanner
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while(remainingAttempts > 0) {
            System.out.print("You have " + remainingAttempts + " attempts left. Take a guess: ");
            String guess = scanner.nextLine().toLowerCase();

            // Re prompt while length is not matching
            if (guess.length() != 5) {
                System.out.print("Pls enter a five letter word: ");
                continue;
            }

            // End game on match
            if (guess.equals(expectedMatch)) {
                System.out.println("Correct!! The secret word was " + secretWord);
                scanner.close();
                break;
            }

            String[] charMatch = expectedMatch.split("");
            String[] charGuess = guess.split("");

            // Initialize states for the characters
            int[] states = new int[charMatch.length];
            Arrays.fill(states, -1);

            // Get green letters;
            for(int i = 0; i < states.length; i++) {
                if (charGuess[i].equals(charMatch[i])) {
                    states[i] = 0;
                }
            }

            // Get yellow letters
            for (int i = 0; i < states.length; i++) {
                if (states[i] == 0) continue;
                for (int j = 0; j < states.length; j++) {
                    if (charMatch[i].equals(charGuess[j]) && states[j] == -1) {
                        states[j] = 1;
                        break;
                    }
                }
            }

            // Print result
            System.out.println("\n");

            String output = "Guess: ";

            for (int i = 0; i < states.length; i++) {
                if (states[i] == 0) output = output.concat(ConsoleColors.GREEN);
                if (states[i] == 1) output = output.concat(ConsoleColors.YELLOW);
                output = output.concat(charGuess[i] + " " + ConsoleColors.RESET);
            }

            System.out.println(output);


            // Decrease attempts
            remainingAttempts--;
        }
        if (remainingAttempts == 0) {
            System.out.println("You lost! The secret word was " + secretWord);
        }
    }
}
