package the.max.schoolfinal.ulohy;

import the.max.schoolfinal.utils.Utils;

import java.util.ArrayList;

public class Uloha16 {

    /*
    NEPOCHOPIL JSEM ZADÁNÍ JEBU NA TO
     */

    public void start() {
        Banda b = new Banda();
        b.prepare(10);
        b.drawList();
    }

    public class Banda {

        protected ArrayList<Loupeznik> list = new ArrayList<Loupeznik>();

        public Banda() {

        }

        public void prepare(int count) {
            for (int i = 1; i <= count; i++) {
                list.add(new Loupeznik(Utils.getRandomName(), i));
            }
        }

        public void nextRound() {
            for (Loupeznik l : list) {
                l.zvolitCislo(list.size());
            }
        }

        public void drawList() {
            for (Loupeznik l : list) {
                System.out.println(l.toString());
            }
        }

    }

    public class Loupeznik {

        protected String jmeno;

        protected int misto, zvoleneCislo = 0;

        public Loupeznik(String j, int m) {
            misto = m;
            jmeno = j;
        }

        public void zvolitCislo(int maxSize) {
            zvoleneCislo = Utils.getRandomNumber(1, maxSize);
        }

        @Override
        public String toString() {
            return "Loupeznik{" +
                    "jmeno='" + jmeno + '\'' +
                    ", misto=" + misto +
                    '}';
        }
    }

}
