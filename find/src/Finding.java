import java.util.Scanner;

public class Finding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //read dimension of matrix and check if it is valid number
        int n;
        System.out.println("Input the dimension of a matrix.");
        while (!sc.hasNextInt() || (n = sc.nextInt()) < 0) {
            System.out.println("Invalid input. Try again");
            sc.nextLine();
        }

        //read matrix
        int mat[][] = new int[n][n];
        System.out.println("Input matrix values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Matrix must contain only numbers.");
                    sc.close();
                    return;
                }
                mat[i][j] = sc.nextInt();
            }
        }

        //Finding the number
        int val;
        boolean found = false;
        System.out.println("Input the number you want to find in the matrix");
        while(!sc.hasNextInt()) {
            System.out.println("Invalid input. Try again.");
            sc.next();
        }
        val = sc.nextInt();

        for(int x[]: mat){
            for(int y: x){
                if( y == val){
                    found = true;
                    break;
                }
            }
        }

        if(found){
            System.out.println("Nalezeno");
        } else
            System.out.println("Nenalezeno");

        sc.close();
    }
}
