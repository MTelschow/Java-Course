package Exercises.string_stringBuilder.stringbuilder_example;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Value");
        StringBuilder sb2 = new StringBuilder("Value");
        System.out.println(sb1.toString().equals(sb2.toString()));
        System.out.println(sb1.append(sb2));
        System.out.println(sb1.reverse());
    }

}
