package projects.hangman;

public class HangmanGame {
    public static void main(String[] args) {
        Hangman hangman = new Hangman("Moonlanding", 5);
        hangman.play();
    }
}
