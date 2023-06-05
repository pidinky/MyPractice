public class argumentTest {

    public static void main(String[] args) {
        Test testik = new Test();
        int a = 3, b = 3;

        testik.fce(a, b);
        System.out.println("a = " + a + " b = " + b);

        testik.fce(testik);
        System.out.println("a = " + a + " b = " + b);
    }
}
