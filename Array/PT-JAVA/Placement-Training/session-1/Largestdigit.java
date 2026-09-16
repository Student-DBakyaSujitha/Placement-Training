//Find Largest Digit
import java.util.Scanner;
public class Largestdigit
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int largest = 0;
            while(num != 0)
            {
                int digit = num % 10;
                if(digit > largest)
                {
                    largest = digit;
                }
                num = num / 10;
            }
            System.out.println("The largest digit is: " + largest);
        }
    }
}