package Exercises.oop;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Gurrrr");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        animal.makeSound();
        bird.makeSound();
        parrot.makeSound();
    }
}
