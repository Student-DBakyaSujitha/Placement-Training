//Find the first digit of a number
import java.util.Scanner;
public class Firstdigit
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            while(num >= 10)
            {
                num = num / 10;
            }
            System.out.println("The first digit is: " + num);
        }
    }
}