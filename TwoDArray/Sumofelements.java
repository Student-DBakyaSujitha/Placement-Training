package TwoDArray;

import java.util.Scanner;

public class Sumofelements {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[][] a = new int[2][3];
            int sum = 0;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                    sum += a[i][j];
                }
            }

            System.out.println("Sum = " + sum);
        }
    }
}