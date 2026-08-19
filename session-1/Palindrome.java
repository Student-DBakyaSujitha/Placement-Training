//Check Palindrome Number getting input from the user
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }
        }
    }

    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}