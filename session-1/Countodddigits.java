//Count Odd Digits
import java.util.Scanner;
public class Countodddigits 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int count = 0;
            while(num != 0)
            {
                int digit = num % 10;
                if(digit % 2 != 0)
                {
                    count++;
                }
                num = num / 10;
            }
            System.out.println("The number of odd digits is: " + count);
        }
    }
}