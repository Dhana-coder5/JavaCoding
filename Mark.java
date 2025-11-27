
import java.util.Scanner;

public class Mark {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark:");
        int mark = input.nextInt();
        if (mark >= 40) {
            if (mark >= 75) {
                System.out.println("Pass with Distinction");
            } else {
                System.out.println("Pass");

            }
        } else {
            System.out.println("Fail");
        }

    }

}
