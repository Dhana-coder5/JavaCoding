
import java.util.Scanner;

public class DOFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        do {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;

        } while (num != 0);
    }
}
