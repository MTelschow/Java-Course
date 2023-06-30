package Exercises.ControlFlow.Number6;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 2, 1};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
