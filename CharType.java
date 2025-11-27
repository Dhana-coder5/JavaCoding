
import java.util.Scanner;

public class CharType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') | (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphebets");
        } else {
            System.out.println("Special symbols");
        }

    }
}
