package the.max.schoolfinal.utils;

import java.util.Random;

public class Utils {

    public static Random r = new Random();

    private static String[] names = new String[] {"Bill", "Jozo", "Fera", "Fred", "Petr", "Max", "Luky", "Kenoi", "Mark", "Filip", "Petr", "Tom"};

    private static String[] lastnames = new String[] {"Holomek", "Vícha", "Novák", "Valenta", "Anděl", "Šmach"};

    public static String getRandomName() {
        return names[r.nextInt(names.length)];
    }

    public static String getRandomLastName() {
        return lastnames[r.nextInt(lastnames.length)];
    }

    public static Integer getRandomNumber(int size) {
        String n = "";
        for (int i = 1; i <= size; i++)
            n += "" + r.nextInt(10);
        return Integer.valueOf(n);
    }

}
