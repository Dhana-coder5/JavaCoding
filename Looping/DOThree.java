
import java.util.Scanner;

public class DOThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int num = input.nextInt();
        int num;
        do {
            System.out.println("Enter a number:");
            num = input.nextInt();
        } while (num != 0);

        System.out.println("Stop");

        //System.out.println("Stopped.");
    }

}
