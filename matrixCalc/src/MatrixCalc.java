import java.util.Scanner;

public class MatrixCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of rows: ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int rows = sc.nextInt();

        System.out.println("Input number of columns: ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int cols = sc.nextInt();

        MatrixInput.fillMatrix(sc, rows, cols);
        MatrixInput.printMatrix(rows, cols);
        sc.close();

    }
}
