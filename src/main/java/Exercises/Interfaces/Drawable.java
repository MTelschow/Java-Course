package Exercises.Interfaces;

public interface Drawable {
    void draw();

    default void erase() {
        System.out.println("Erase drawing");
    }

    default void printInfo() {}
}
