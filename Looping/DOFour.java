
import java.util.Scanner;

public class DOFour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        int i = 1;
        int fact = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= num);
        System.out.println("Factorial of a number is:" + fact);
    }
}
