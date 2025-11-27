
import java.util.Scanner;

public class Adult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        {
            if (age >= 18 && age <= 30) {
                System.out.println("Young Age");
            } else if (age > 30 && age <= 50) {
                System.out.println("Middle age");
            } else if (age >= 51) {
                System.out.println("Senier age");
            } else {
                System.out
                        .println("Invalid user");
            }

        }
    }
}
