
import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }

    }
}
