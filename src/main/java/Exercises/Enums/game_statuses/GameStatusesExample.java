package Exercises.Enums.game_statuses;

public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus status: GameStatus.values()) {
            System.out.println(status);
        }
        GameStatus currentStatus = GameStatus.PAUSED;
    }
}
