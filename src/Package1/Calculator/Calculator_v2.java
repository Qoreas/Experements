package Package1.Calculator;

import java.util.Scanner;

public class Calculator_v2 {
    private static final Scanner scan = new Scanner(System.in);

    private static void messageAndWork(String mes) {
        System.out.println(mes);
        work();
    }

    private static void printResult(double result) {
        System.out.println("Result = " + result);
        System.out.println("Calculator stopped");
    }

    public static void work() {
        entry();
    }

    private static void entry() {
        System.out.println();
        System.out.println("Operators to use: +, -, *, /, ^, % (input only 0 to stop)");
        System.out.print("Input first number, operator (only one) and second number: ");

        check();
    }

    private static void check() {
        try {
            String request = scan.nextLine();
            String[] operators = request.toLowerCase().split(" ");

            if (Integer.parseInt(operators[0]) == 0) {
                System.out.println("Calculator stopped");
                System.exit(1);
            } else {
                switcher(operators);
            }

        } catch (ArrayIndexOutOfBoundsException e1) {
            messageAndWork("Not enough arguments, try again.");
        } catch (NumberFormatException e2) {
            messageAndWork("Input numbers and operator like: 1 + 2");
        }
    }

    private static void switcher(String[] request) {
        double num1 = Double.parseDouble(request[0]);
        double num2 = Double.parseDouble(request[2]);

        switch (request[1]) {
            case "+" -> plus(num1, num2);
            case "-" -> minus(num1, num2);
            case "*" -> multiplication(num1, num2);
            case "/" -> division(num1, num2);
            case "^" -> degree(num1, num2);
            case "%" -> percent(num1, num2);

            default -> messageAndWork("Incorrect operator. Try again.");
        }
    }

    private static void plus(double num1, double num2) {
        printResult(num1 + num2);
    }

    private static void minus(double num1, double num2) {
        printResult(num1 - num2);
    }

    private static void multiplication(double num1, double num2) {
        printResult(num1 * num2);
    }

    private static void division(double num1, double num2) {
        printResult(num1 / num2);
    }

    private static void degree(double num1, double num2) {
        double result = num1;
        for (int i = 1; i < num2; i++) {
            result *= num1;
        }
        printResult(result);
    }

    private static void percent(double num1, double num2) {
        double percent = num2 / 100 * num1;
        printResult(percent);
    }
}