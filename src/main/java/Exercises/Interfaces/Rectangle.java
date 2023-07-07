package Exercises.Interfaces;

public class Rectangle implements Drawable, Countable{
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle info");
    }
}
