//Sum of 1 to N
import java.util.Scanner;
public class Sum    
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int sum = 0;
            for(int i = 1; i <= num; i++)
            {
                sum += i;
            }
            System.out.println("Sum of 1 to " + num + " is: " + sum);
        }
    }
}