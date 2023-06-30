package Exercises.Random;

public class Main {
    public static void main(String[] args) {
        Person guy = new Person();
        guy.name = "Jeff";
        guy.age = 13;
        System.out.println(guy.name + " " + guy.age);
        modifyPerson(guy);
        System.out.println(guy.name + " " + guy.age);

    }

    public static void modifyPerson(Person p) {
        p.name = "Jane";
        p.age = 3;
    }
}
