package the.max.schoolfinal.ulohy;

import the.max.schoolfinal.utils.Utils;

import java.util.ArrayList;

public class Uloha15 {

    public void start() {
        TelSeznam s = new TelSeznam();
        for (int i = 0; i <= 22; i++) {
            s.pridatKontakt(new Kontakt(Utils.getRandomName() + " " + Utils.getRandomLastName(), "" + Utils.getRandomNumber(9)));
        }
        for (Kontakt k : s.getList()) {
            System.out.println(k.toString());
        }
    }

    public class TelSeznam {

        protected ArrayList<Kontakt> list = new ArrayList<Kontakt>();

        public TelSeznam() {

        }

        public void pridatKontakt(Kontakt k) {
            if (list.contains(k)) return;
            list.add(k);
        }

        public void odstranitKontakt(Kontakt k) {
            if (!list.contains(k)) return;
            list.remove(k);
        }

        public ArrayList<Kontakt> getList() {
            return list;
        }

    }

    public class Kontakt {

        protected String jmeno, tel;

        public Kontakt(String j, String t) {
            jmeno = j;
            tel = t;
        }

        @Override
        public String toString() {
            return "Kontakt{" +
                    "jmeno='" + jmeno + '\'' +
                    ", tel='" + tel + '\'' +
                    '}';
        }
    }

}
