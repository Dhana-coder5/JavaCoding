
import java.util.Scanner;

public class Schollership {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your mark:");
        int mark = obj.nextInt();
        System.out.println("Enter your income:");
        int income = obj.nextInt();

        if (mark >= 75 && income < 100000) {
            System.out.println("Elligible for schollership");
        } else {
            System.out.println("Not eligible");
        }

    }
}
