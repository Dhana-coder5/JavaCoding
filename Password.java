
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter password:");
        String pwd = obj.nextLine();

        if (pwd.length() >= 6) {

            char c0 = pwd.charAt(0);
            char c1 = pwd.charAt(1);
            char c2 = pwd.charAt(2);
            char c3 = pwd.charAt(3);
            char c4 = pwd.charAt(4);
            char c5 = pwd.charAt(5);

            if ((c0 >= '0' && c0 <= '9')
                    || (c1 >= '0' && c1 <= '9')
                    || (c2 >= '0' && c2 <= '9')
                    || (c3 >= '0' && c3 <= '9')
                    || (c4 >= '0' && c4 <= '9')
                    || (c5 >= '0' && c5 <= '9')) {

                System.out.println("Valid Password");

            } else {
                System.out.println("Invalid — Must contain a digit");
            }

        } else {
            System.out.println("Invalid — Length must be = 6");
        }
    }
}
