package Array;
import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int product = 1;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product = product * arr[i];
        }

        System.out.println("Product of array elements = " + product);

        sc.close();
    }
}