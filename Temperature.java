
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int Temp = input.nextInt();
        if (Temp < 0) {
            System.out.println("Freezing");
        } else if (Temp > 0 && Temp <= 20) {
            System.out.println("Cold");
        } else if (Temp <= 35) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

    }
}
