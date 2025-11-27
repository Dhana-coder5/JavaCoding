
import java.util.Scanner;

public class Fruit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the choice \n1.Apple \n2.Banana \n3.Mango ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Apple Price -- 100");
                break;
            case 2:
                System.out.println("Banana Price -- 40");
                break;
            case 3:
                System.out.println("Mango Price -- 120");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
