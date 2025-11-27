
import java.util.Scanner;

public class Citizen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        if (age >= 60) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Not a senior citizen");
        }

    }
}
