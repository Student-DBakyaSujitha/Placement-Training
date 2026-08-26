//Print 1 to N
import java.util.Scanner;
public class Printnum   
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            for(int i = 1; i <= num; i++)
            {
                System.out.println(i);
            }
        }
    }
}