
import java.util.Scanner;

public class Character {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character to check:");
        int Char = input.next().charAt(0);
        if ("aeiouAEIOU".indexOf(Char) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }

    }
}
