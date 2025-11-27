
import java.util.Scanner;

public class bill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your units:");
        int unit = input.nextInt();
        int amount;
        if (unit > 0 && unit <= 100) {
            amount = unit * 5;
            System.out.println("Amount=" + amount);
        } else if (unit >= 101 && unit <= 100) {
            amount = unit * 7;
            System.out.println("Ampunt=" + amount);
        } else {
            amount = unit * 10;
            System.out.println("Amount=" + amount);
        }
    }
}
