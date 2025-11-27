
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = input.nextInt();
        System.out.println("Enter second number:");
        int second = input.nextInt();
        System.out.println("Select the operator \n1.+\n2.-\n3.*\n4./");
        int operator = input.nextInt();
        int result;

        switch (operator) {

            case 1 -> {
                result = first + second;
                System.out.println("Result = " + result);
            }

            case 2 -> {
                result = first - second;
                System.out.println("Result = " + result);
            }

            case 3 -> {
                result = first * second;
                System.out.println("Result = " + result);
            }

            case 4 -> {
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
            }

            default ->
                System.out.println("Invalid operator!");

        }
    }
}
