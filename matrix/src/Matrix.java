import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Input the dimension of square matrix:");
        if(!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }
        n = sc.nextInt();

        int mat[][] = new int[n][n];
        System.out.println("Input matrix values:");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (!sc.hasNextInt()){
                    System.out.println("Invalid input");
                    sc.close();
                    return;
                }
                    mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix:");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}