public class Test {
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void fce(int a, int b){
        a *= 2;
        b += 2;
    }
    // not working :(
    void fce(Test test){
        test.a *= 2;
        test.b += 2;
    }
}
