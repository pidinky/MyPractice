package alsa;

import alsa.entity.Notebook;

import static alsa.entity.NotebookCategory.*;

public class MutableObjectExample {

    private static
    public static void main(String[] args) {
        Notebook lenovo = new Notebook("Lenovo Yoga", BASIC, 10000);

        for(int i = 0; i < notebooks.length; i++) {
            System.out.printf("%s %s %s\n", notebooks[i].getName(), notebooks[i].getCategory(), notebooks[i].getPrice());
        }

        System.out.println("Hello, world!");
    }
}
