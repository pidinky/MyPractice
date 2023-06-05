import java.util.Scanner;

public class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol1, vol2;

       /* myBox1.height = 1;
        myBox1.width = 2;
        myBox1.length = 4;*/
        myBox1.setDimensions(1, 2, 4);

       vol1 = myBox1.volume();

      /* myBox2.height = 2;
       myBox2.width = 4;
       myBox2.length = 7; */
        myBox2.setDimensions(2, 4, 7);
       vol2 = myBox2.volume();

       System.out.println("Volume of the box 1 is " + vol1);
       System.out.println("Volume of the box 2 is " + vol2);
    }
}
