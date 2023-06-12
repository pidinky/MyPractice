import java.util.Scanner;

public class MatrixInput {
       /* int rows, cols;

    public MatrixInput(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }*/

    private int values[][];

    public MatrixInput(int[][] values) {
        this.values = values;
    }

    void fillMatrix(Scanner sc, int rows, int cols){
        int values[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                values[i][j] = sc.nextInt();
            }
        }
    }

    void printMatrix(values, int rows, int cols){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
