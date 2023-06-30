package Exercises.ControlFlow.Number2;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        String comment;

        switch (grade) {
            case 'A':
                comment = "Also";
                break;
            case 'B':
                comment = "Because";
                break;
            case 'C':
                comment = "Can";
                break;
            case 'D':
                comment = "Dad";
                break;
            case 'E':
                comment = "Excellent";
                break;
            case 'F':
                comment = "Fuck";
                break;
            default:
                comment = "No";
        }
        System.out.println(comment);
    }
}
