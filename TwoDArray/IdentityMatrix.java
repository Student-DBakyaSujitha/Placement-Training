//Check Whether a matrix is an identity matrix
import java.util.Scanner;

public class IdentityMatrix {
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

        boolean isIdentity = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) {
                break;
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

        scanner.close();
    }
}