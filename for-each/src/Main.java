public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int x: arr) {
            sum += x;
        }
        System.out.println("suma je " + sum);

        String pole[] = {"Ahoj,", "jak", "to", "jde", "?"};

        for (String y: pole){
            System.out.print(y + " ");
        }
        System.out.println();
    }
}
