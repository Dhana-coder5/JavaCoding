
import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A:");
        int A = input.nextInt();
        System.out.println("Enter B");
        int B = input.nextInt();
        System.out.println("ENter C");
        int C = input.nextInt();
        if (A < B) {
            if (A < C) {
                System.out.println(A + "is lowest");
            } else {
                System.out.println(C + "is lowest");
            }
        } else {
            if (B < C) {
                System.out.println(B + "is lowest");
            } else {
                System.out.println(C + "is lowest");
            }
        }
    }
}
