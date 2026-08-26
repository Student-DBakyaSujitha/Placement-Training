//Check Whether Number Contains 0
import java.util.Scanner;
public class Zeropresence
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            boolean containsZero = false;
            while(num != 0)
            {
                if(num % 10 == 0)
                {
                    containsZero = true;
                    break;
                }
                num = num / 10;
            }
            if(containsZero)
            {
                System.out.println("The number contains 0.");
            }
            else
            {
                System.out.println("The number does not contain 0.");
            }
        }
    }
}