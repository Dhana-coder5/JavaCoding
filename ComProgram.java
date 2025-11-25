
import java.util.Scanner;

public class ComProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check:");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Positive number");
        }
    }
}
