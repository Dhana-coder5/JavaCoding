
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter side A:");
        int a = obj.nextInt();
        System.out.println("Enter side B:");
        int b = obj.nextInt();
        System.out.println("Enter side C:");
        int c = obj.nextInt();
        {
            if (a == b && b == c) {
                System.out.println("Equalateral triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isoseles triangle");
            } else {
                System.out.println("Scalence Triangle");
            }

        }

    }
}
