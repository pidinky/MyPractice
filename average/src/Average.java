public class Average {
    public static void main(String[] args) {
        double arr[] = {12.5, 13.1, 19.2, 24.2, 30.4};
        double avg = 0;
        int size = arr.length;

        System.out.println("Size of array is " + size + ".");
        for (int i = 0; i < size; i++){
            avg += arr[i];
        }
        avg = avg / size;
        System.out.printf("Average value is: %.2f%n", avg);

       int i = 100, j = 200;
       while (++i < --j);
        System.out.println("Stredni hodnota je: " + i + ", j = " + j);

        int n = 100, m = 200;
        while(n++ < m--)
            System.out.println("n = " + n + ", m = " + m);
        System.out.println("n = " + n + ", m = " + m);
    }
}
