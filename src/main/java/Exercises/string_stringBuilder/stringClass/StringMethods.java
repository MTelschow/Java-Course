package Exercises.string_stringBuilder.stringClass;

public class StringMethods {
    public static void main(String[] args) {
        String str = new String("Hello World!");
        System.out.println("Length: " + str.length());
        System.out.println("LowerCase: " + str.toLowerCase());
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println(str.substring(7, 12));
        System.out.println(str.replace("World", "Java"));
    }
}
