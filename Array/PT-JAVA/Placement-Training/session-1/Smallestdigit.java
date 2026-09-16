//Find Smallest Digit
import java.util.Scanner;
public class Smallestdigit
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int smallest = 9;
            while(num != 0)
            {
                int digit = num % 10;
                if(digit < smallest)
                {
                    smallest = digit;
                }
                num = num / 10;
            }
            System.out.println("The smallest digit is: " + smallest);
        }
    }
}