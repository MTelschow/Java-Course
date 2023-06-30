package Exercises.ControlFlow.Number7;

public class Main {
    public static void main(String[] args) {
        int grades[] = {100, 2, 24, 12, 65};
        int lowest = grades[0];
        int highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }
        System.out.println("Lowest: " + lowest);
        System.out.println("Highest: " + highest);
    }
}
