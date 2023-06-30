package Exercises.ControlFlow.Number8;

public class Main {
    public static void main(String[] args) {
        int numbers[] = { 1, 4, 3, 6, 8, 9};
        double sum = 0;
        int count = 0;

        for (int number: numbers) {
            if (number % 2 == 1) {
                sum += number;
                count++;
            }
        }
        double average = sum;
        if (count != 0) {
            average = sum / count;
        }
        System.out.println(average);
    }
}
