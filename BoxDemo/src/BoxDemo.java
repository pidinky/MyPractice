import java.util.Scanner;
import java.util.function.BiPredicate;

public class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box myBox1 = new Box();
        Box myBox2 = new Box(2);
        Box myBox3 = new Box(2, 4, 5);
        Box myBox4 = new Box(myBox2);
        double vol1, vol2, vol3;

       /* myBox1.height = 1;
        myBox1.width = 2;
        myBox1.length = 4;*/
       // myBox1.setDimensions(1, 2, 4);

       vol1 = myBox1.volume();

      /* myBox2.height = 2;
       myBox2.width = 4;
       myBox2.length = 7; */
      //  myBox2.setDimensions(2, 4, 7);
       vol2 = myBox2.volume();
       vol3 = myBox3.volume();

       System.out.println("Volume of the box with no dimensions is " + vol1);
       System.out.println("Volume of the box with one dimension is " + vol2);
       System.out.println("Volume of the box with three dimensions is " + vol3);
        System.out.println("Height of box4 = " + myBox4.height + " width = " + myBox4.width + " length = " + myBox4.length);
    }
}
