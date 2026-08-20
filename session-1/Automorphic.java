//Check Automorphic Number getting input from the user
import java.util.Scanner;   

public class Automorphic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int square = n * n;
            int temp = n;
            boolean isAutomorphic = true;
            while (temp > 0) {
                if (temp % 10 != square % 10) {
                    isAutomorphic = false;
                    break;
                }
            temp /= 10;
            square /= 10;
        }
        if (isAutomorphic) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }
    }
}
}