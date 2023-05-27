import java.util.Scanner;

public class BasicExercise {

    public static void main(String[] args) {
       /* boolean a, b;
        char c, d;
        int f, g, h, i;

        a = true;
        b = false;

        c = 70;
        d = 72;

        f = 123_456_789;
        g = 0xf;
        h = 05;
        i = 0b1010;

        System.out.println("a is " + a);
        System.out.println("b is " + b);

        System.out.println("10 > 9 is " + (10 > 9));
        System.out.println("10 < 9 is " + (10 < 9));
        System.out.println("10 = 9 is " + (10 == 9));

        System.out.println("c is " + c);
        System.out.println("d is " + d);

        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i is " + Integer.toHexString(i));*/

        int x, y, c;
        double d;

        System.out.println("Zadej cislo, ktere chces porovnat.");
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        x = sc.nextInt();

        if (x < 10) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println("x je mensi nez deset je " + y);

        d = 2.45;
        c = (int) d;

        System.out.println("c is now " + c);
    }
}
