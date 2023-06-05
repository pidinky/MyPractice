public class Overload {

    public static void main(String[] args) {
        OverloadDemo over = new OverloadDemo();
        int i = 10;
        double j = 5;

        over.test(j);
        over.test(i, j);
    }
}
