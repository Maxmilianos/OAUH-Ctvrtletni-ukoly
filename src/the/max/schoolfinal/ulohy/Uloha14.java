package the.max.schoolfinal.ulohy;

import java.util.ArrayList;
import java.util.Random;

public class Uloha14 {

    protected Random r = new Random();

    /*

    NECHÁPU CO SE MYSLÍM TÍM VÍCE KARET - BINGO JSEM NIKDY NEHRÁL NEJSEM DŮCHODCE!

     */

    public void start() {
        Bingo b = new Bingo();
        b.createFields();
        b.drawFields();
        int count = 0;
        while (!b.checkWinner()) {
            System.out.println("");
            int trying = 1 + r.nextInt(75);
            System.out.println("Trying number " + trying);
            if (b.tryNumber(trying)) {
                System.out.println("We got im! ");
            }
            b.drawFields();
            count ++;
        }
        System.out.println("WIN! " + count);
    }

    public class Bingo {

        protected ArrayList<Field> fields = new ArrayList<Field>();

        public Bingo() {

        }

        public void createFields() {
            for (int x = 1; x <= 5; x++) {
                for (int y = 1; y <= 5; y++) {
                    fields.add(new Field(x, y, 1 + r.nextInt(75)));
                }
            }
        }

        public void drawFields() {
            for (Field f : fields) {
                System.out.print((f.available ? f.number : "X") + " ");
                if (f.y % 5 == 0)
                    System.out.println("");
            }
        }

        public boolean tryNumber(int number) {
            Field field = haveFieldNumber(number);
            if (field != null) {
                field.available = false;
            }
            return field != null;
        }

        public Field haveFieldNumber(int number) {
            for (Field f : fields) {
                if (f.number == number)
                    return f;
            }
            return null;
        }

        public Field getField(int x, int y) {
            for (Field f : fields) {
                if (f.x == x && f.y == y)
                    return f;
            }
            return null;
        }

        public boolean checkWinner() {
            boolean win = false;
            // kontrolovani horizontalniho smeru
            for (int x = 1; x <= 5; x++) {
                for (int y = 1; y <= 5; y++) {
                    Field field = getField(x, y);
                    if (field != null) {
                        if (y == 1) {
                            win = true;
                        }
                        if (field.available) {
                            win = false;
                        }
                        if (y % 5 == 0 && win) {
                            return win;
                        }
                    } else {
                        System.out.println("ERROR: CHECKWINNER - 589");
                    }
                }
            }

            //kontrolovani vertikalniho smeru
            for (int y = 1; y <= 5; y++) {
                for (int x = 1; x <= 5; x++) {
                    Field field = getField(x, y);
                    if (field != null) {
                        if (x == 1) {
                            win = true;
                        }
                        if (field.available) {
                            win = false;
                        }
                        if (x % 5 == 0 && win) {
                            return win;
                        }
                    } else {
                        System.out.println("ERROR: CHECKWINNER - 687");
                    }
                }
            }
            return win;
        }

    }

    public class Field {

        protected int x, y, number;

        protected boolean available = true;

        public Field(int x, int y, int n) {
            this.x = x;
            this.y = y;
            this.number = n;
        }

    }

}
