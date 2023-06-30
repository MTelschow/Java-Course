package Exercises.ControlFlow.Number1;

public class Main {
    public static void main(String[] args) {
        int age = 10;
        if (age < 5) {
            System.out.println("Free under 5");
        } else if (age < 13) {
            System.out.println("5 for 5-12");
        } else if (age < 19) {
            System.out.println("10 under 19");
        } else {
            System.out.println("15 for the rest");
        }
    }
}
