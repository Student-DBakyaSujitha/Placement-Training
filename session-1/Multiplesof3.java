//Count Multiples of 3 from 1 to N
import java.util.Scanner;
public class Multiplesof3   
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int count = 0;
            for(int i = 1; i <= num; i++)
            {
                if(i % 3 == 0)
                {
                    count++;
                }
            }
            System.out.println("Count of multiples of 3 from 1 to " + num + " is: " + count);
        }
    }
}