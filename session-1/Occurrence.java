//Count Occurrence of a Digit
import java.util.Scanner;
public class Occurrence
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Enter a digit to count its occurrence: ");
            int digitToCount = sc.nextInt();
            int count = 0;
            while(num != 0)
            {
                int digit = num % 10;
                if(digit == digitToCount)
                {
                    count++;
                }
                num = num / 10;
            }
            System.out.println("The occurrence of digit " + digitToCount + " is: " + count);
        }
    }
}