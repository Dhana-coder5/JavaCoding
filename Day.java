
import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the choice \n1.sunday \n2.monday \n3.tuesday \n4.wednesday\n5.thursday\n6.friday\n7.saturday ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
