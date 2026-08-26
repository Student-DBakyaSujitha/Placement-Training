//Print Odd Numbers from 1 to N
import java.util.Scanner;
public class Oddnum
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            for(int i = 1; i <= num; i++)
            {
                if(i % 2 != 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}