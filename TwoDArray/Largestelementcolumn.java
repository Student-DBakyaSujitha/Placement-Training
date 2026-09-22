//largest elements in each column
import java.util.Scanner;
public class Largestelementcolumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Largest element in each column:");
        for (int j = 0; j < cols; j++) {
            int largest = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
            System.out.println("Column " + (j + 1) + ": " + largest);
        }

        scanner.close();
    }
}