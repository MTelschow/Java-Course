package Exercises.Constructors.super_this;

public class Dog extends Animal{
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public Dog() {
        this("Dog", 2, "Corgi");
    }
}
