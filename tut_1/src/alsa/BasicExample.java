package alsa;

import alsa.entity.Notebook;

import static alsa.entity.NotebookCategory.*;

public class BasicExample {
    public static void main(String[] args) {
        Notebook lenovo = new Notebook("Lenovo Yoga", BASIC, 10000);
        Notebook hp = new Notebook("HP Business", PROFESSIONAL, 40000);
        Notebook dell = new Notebook("Dell XP", GAMING, 30000);

        //pole notebooku, at je muzu prochazet
        Notebook[] notebooks = new Notebook[] {lenovo, hp, dell};

        for(int i = 0; i < notebooks.length; i++) {
            System.out.printf("%s %s %s\n", notebooks[i].getName(), notebooks[i].getCategory(), notebooks[i].getPrice());
        }

        System.out.println("Hello, world!");
    }
}
