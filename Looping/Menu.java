
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("enter the choice \n1.coffee\n2.Tea\n3.Vada\n4.dosa\n5.Exit");
        int choice;

        do {
            System.out.println("enter the choice \n1.coffee\n2.Tea\n3.Vada\n4.dosa\n5.Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Coffee");
                    break;
                case 2:
                    System.out.println("Tea");
                    break;
                case 3:
                    System.out.println("Vada");
                    break;
                case 4:
                    System.out.println("Dosa");
                    break;
                case 5:
                    System.out.println("Thankyou!!!");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 5);
        //System.out.println("Exit");

    }
}
