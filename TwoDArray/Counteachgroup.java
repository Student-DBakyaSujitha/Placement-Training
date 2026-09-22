//count Positive Negative and Zero element

import java.util.Scanner;   

public class Counteachgroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > 0) {
                    positive++;
                } else if (matrix[i][j] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println("Count of Positive elements: " + positive);
        System.out.println("Count of Negative elements: " + negative);
        System.out.println("Count of Zero elements: " + zero);

        scanner.close();
    }
}