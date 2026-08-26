//Remove Last Digit
import java.util.Scanner;
public class Lastdigitremove
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            num = num / 10;
            System.out.println("The number after removing the last digit is: " + num);
        }
    }
}