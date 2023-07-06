package Exercises.AccesModifiers.Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Counter.count);
        Counter.increment();
        System.out.println(Counter.count);
        Counter.increment();
        System.out.println(Counter.count);
        Counter.increment();
        System.out.println(Counter.count);
    }
}
