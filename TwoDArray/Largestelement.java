//Find the largest elements 
package TwoDArray;

import java.util.Scanner;

public class Largestelement {
     public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        int[][] a = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int largest = a[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
            }
        }

        System.out.println("Largest = " + largest);
        }
    }
}
