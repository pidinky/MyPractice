import java.util.Random;
import java.util.Scanner;

public class TestMatrixGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Input dimension of the square matrix you want to generate:");
        while(!sc.hasNextInt() || (n = sc.nextInt()) <= 0) {
            System.out.println("Invalid input. Try again (valid values are integers bigger than 0).");
            sc.nextLine();
        }

        int[][] matrix = generateTestMatrix(n);
        //Print the matrix
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateTestMatrix(int n){
        Random random = new Random();
        int[][] matrix = new int[n][n];

        //generates values between 0 and 99
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(100);
            }
        }

        return matrix;
    }
}
