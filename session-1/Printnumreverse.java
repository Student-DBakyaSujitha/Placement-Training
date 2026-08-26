//Print N to 1
import java.util.Scanner;
public class Printnumreverse
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            for(int i = num; i >= 1; i--)
            {
                System.out.println(i);
            }
        }
    }
}