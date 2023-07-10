package Exercises.LambdaExpressions;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator n1 = (a, b) -> a - b;
        System.out.println(n1.operate(4, 3));
        NumericOperator n2 = (a, b) -> Math.max(a, b);
        System.out.println(n2.operate(12, 32));

        StringFormatter toUpper = a -> a.toUpperCase();
        System.out.println(toUpper.format("hello"));
    }
}
