import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        boolean isValidInput = false;
        double a;

        System.out.println("Input length of the side: ");
        if(!sc.hasNextDouble()){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        a = sc.nextDouble();
        System.out.println("a is " + a);
        sc.close();
    }
}
