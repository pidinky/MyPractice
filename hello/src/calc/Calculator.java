package calc;

import  java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        int a,b;
        char c;

        System.out.println("Input two numbers that you want to count with:");
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        a = sc.nextInt();

        if(!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        b = sc.nextInt();
        if(b == 0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        c = 88;
        System.out.println("c = " + c);

    }
}
