package Exercises.Generics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(1);
        integerSet.add(10);
    }
}
