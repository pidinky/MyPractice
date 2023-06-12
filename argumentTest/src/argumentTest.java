public class argumentTest {

    public static void main(String[] args) {
        int a = 3, b = 3;
        Test testik = new Test(a, b);


        testik.fce(a, b);
        System.out.println("a = " + a + " b = " + b);


        testik.fce(testik);
        System.out.println("a = " + testik.a + " b = " + testik.b);
    }
}
