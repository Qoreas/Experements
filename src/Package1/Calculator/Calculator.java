package Package1.Calculator;

public class Calculator {
    private static void print(double result) {
        System.out.println("Result = " + result);
    }

    public static void plus(double num1, double num2) {
        print(num1 + num2);
    }

    public static void minus(double num1, double num2) {
        print(num1 - num2);
    }

    public static void multi(double num1, double num2) {
        print(num1 * num2);
    }

    public static void division(double num1, double num2) {
        print(num1 / num2);
    }

    public static void degree(double num1, double num2) {
        double result = num1;
        for (int i = 1; i < num2; i++) {
            result = result * num1;
        }
        print(result);
    }

    public static void percent(double num1, double num2) {
        double percent = num2 / 100 * num1;
        print(percent);
    }
}
