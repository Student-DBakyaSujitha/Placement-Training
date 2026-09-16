//Find last digit of a number
import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int lastDigit = n % 10;
            System.out.println("The last digit of " + n + " is: " + lastDigit);
        }
    }
}