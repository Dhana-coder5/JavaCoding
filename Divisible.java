
import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        {
            if (number % 5 == 0 && number % 11 == 0) {
                System.out.println("Divisible by both");
            } else if (number % 5 == 0) {
                System.out.println("Divisible by 5");
            } else if (number % 11 == 0) {
                System.out.println("Divisible by 11");
            } else {
                System.out.println("Pls enter valid input");
            }
        }
    }
}
