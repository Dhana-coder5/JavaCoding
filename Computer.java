
import java.util.Scanner;

public class Computer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("is even");

        } else {

            System.out.println("is odd");
        }
    }
}
