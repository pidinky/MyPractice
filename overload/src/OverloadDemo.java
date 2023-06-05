public class OverloadDemo {

    void test(int a) {
        System.out.println("int a = " + a);
    }

    void test(double a, double b) {
        System.out.println("double a = " + a + " double b = " + b);
    }
}
