package the.max.schoolfinal.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Utils {

    public static Random r = new Random();

    private static ArrayList<String> names = new ArrayList<>();//Arrays.asList(new String[] {"Bill", "Jozo", "Fera", "Fred", "Petr", "Max", "Luky", "Kenoi", "Mark", "Filip", "Petr", "Tom"}))

    private static String[] lastnames = new String[] {"Holomek", "Vícha", "Novák", "Valenta", "Anděl", "Šmach"};

    public static String getRandomName() {
        return names.get(r.nextInt(names.size()));
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

    public static Integer getRandomNumber(int minSize, int maxSize) {
        return minSize + r.nextInt(maxSize - minSize);
    }

    public static void load() {
        File f = new File("names.txt");
        if (!f.exists()) {
            System.out.println("File names.txt not found...");
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                names.add(s);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
