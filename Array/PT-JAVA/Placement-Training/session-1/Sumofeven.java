//Sum of Even Numbers up to N

import java.util.Scanner;
public class Sumofeven
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
                if(i % 2 == 0)
                {
                    sum += i;
                }
            }
            System.out.println("Sum of even numbers up to " + num + " is: " + sum);
        }
    }
}