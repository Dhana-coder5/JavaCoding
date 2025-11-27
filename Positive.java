
import java.util.Scanner;

public class Positive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int num = input.nextInt();
        {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("  Possitive and Even number");
                } else {
                    System.out.println("Odd number");
                }
            } else {
                System.out.println("Invalid number");
            }
        }

    }
}
