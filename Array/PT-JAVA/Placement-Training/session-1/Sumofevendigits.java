//Sum of Even Digits
import java.util.Scanner;
public class Sumofevendigits
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int sum = 0;
            while(num != 0)
            {
                int digit = num % 10;
                if(digit % 2 == 0)
                {
                    sum += digit;
                }
                num = num / 10;
            }
            System.out.println("The sum of even digits is: " + sum);
        }
    }
}