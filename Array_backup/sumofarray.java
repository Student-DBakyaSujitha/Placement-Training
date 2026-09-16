package Array_backup;

import java.util.Scanner;

class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}
