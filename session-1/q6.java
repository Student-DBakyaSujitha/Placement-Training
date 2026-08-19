//Check Divisibility by 5
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 5 == 0) {
                System.out.println("The number is divisible by 5.");
            } else {
                System.out.println("The number is not divisible by 5.");
            }
        }
    }
}