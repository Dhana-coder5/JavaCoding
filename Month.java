
import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the choice \n1.January\n2.Feb\n3.march\n4.april\n5.may\n6.june\n7.july\n8.auguest\n9.sept\n10.october\n11.november\n12.december");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("Auguest");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:

                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid input");
                break;

        }

    }
}
