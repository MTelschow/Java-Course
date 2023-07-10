package Exercises.Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(1);
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Beans");
    }
}
