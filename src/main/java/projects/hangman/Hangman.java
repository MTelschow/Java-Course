package projects.hangman;

import projects.utils.ConsoleColors;

import java.util.HashSet;
import java.util.Scanner;

public class Hangman {
    public String secretWord;
    public int attempts;
    public StringBuilder guessedWord;
    public HashSet<Character> guessedLetters;

    public Hangman(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
        this.guessedLetters = new HashSet<>();

        this.guessedWord = new StringBuilder();
        while (guessedWord.length() < secretWord.length()) guessedWord.append("_");
    }

    public void play() {
        String targetWord = secretWord.toLowerCase();
        int remainingAttempts = attempts;
        int correctLetters = 0;

        Scanner input = new Scanner(System.in);


        while (remainingAttempts > 0) {
            printCurrentGuess();
            System.out.print("Guess a letter: ");
            Character guessedChar = input.nextLine().toLowerCase().charAt(0);

            if (guessedLetters.contains(guessedChar)) {
                remainingAttempts--;
                System.out.println("\nYou have already guessed that character!");
                System.out.print("You have " + remainingAttempts + " attempts left. \n");
                continue;
            }

            guessedLetters.add(guessedChar);

            if (targetWord.contains(guessedChar.toString())) {
                updateGuess(guessedChar.toString());
                System.out.println("\nThe secret word DOES contain " + ConsoleColors.BLUE + guessedChar + ConsoleColors.RESET);
            } else {
                remainingAttempts--;
                System.out.println("\nThe secret word does NOT contain an " + ConsoleColors.BLUE + guessedChar + ConsoleColors.RESET);
                System.out.print("You have " + remainingAttempts + " attempts left.\n");
            }

            if (!guessedWord.toString().contains("_")) {
                System.out.println("\n\nYou hav found the secret word " + ConsoleColors.RED + secretWord + ConsoleColors.RESET);
                break;
            }
        }

        if (remainingAttempts == 0) {
            System.out.println(ConsoleColors.RED + "\n\nYou have lost. The mystery word was " + ConsoleColors.RED_UNDERLINED + secretWord + ConsoleColors.RESET);
        }
    }

    public void printCurrentGuess() {
        System.out.println("\n" + ConsoleColors.PURPLE + guessedWord + ConsoleColors.RESET);
    }

    public void updateGuess(String guessedChar) {
        String goalString = secretWord.toLowerCase();
        for (int i = 0; i < secretWord.length(); i++) {
            if (goalString.substring(i, i + 1).equals(guessedChar)) {
                guessedWord.replace(i, i + 1, secretWord.substring(i, i + 1));
            }
        }
    }

}
