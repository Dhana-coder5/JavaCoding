
import java.util.Scanner;

public class ForSeve {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        int i = 1;
        int fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is:" + fact);

    }
}
