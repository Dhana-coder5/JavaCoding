
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enternumber:");
        int num = input.nextInt();
        if (num % 1 == 0 && num % num == 0) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Not a prime number");
        }

    }
}
