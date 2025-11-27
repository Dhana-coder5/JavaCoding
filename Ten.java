
import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int num = input.nextInt();
        if (num >= 10 && num <= 50) {
            System.out.println(" With in the range");
        } else {
            System.out.println("not in the range");
        }

    }
}
