package projects.wordle.wordle;

public class WordleGame {
    public static void main(String[] args) {
        Wordle game = new Wordle("Beans", 6);
        game.play();
    }
}
