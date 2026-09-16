//Product of digits of a number
import java.util.Scanner;
public class Productofdigits
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int product = 1;
            while(num != 0)
            {
                product = product * (num % 10);
                num = num / 10;
            }
            System.out.println("The product of digits is: " + product);
        }
    }
}