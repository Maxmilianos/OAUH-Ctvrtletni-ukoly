package the.max.schoolfinal.ulohy;

import java.util.ArrayList;

public class Uloha13 {

    public void start() {

    }

    public class Hala {

        protected String nazev;

        protected ArrayList<Stroj> stroje = new ArrayList<Stroj>();

        public Hala(String n, ArrayList<Stroj> s) {
            nazev = n;
            stroje = s;
        }

        public void pridatStroj(Stroj s) {
            stroje.add(s);
        }

        public void vypisVsech() {
            for (Stroj s : stroje) {
                System.out.println("Stroj " + s.nazev + ", pocet vyrobku "  + s.pocetVyrobku + ", funguje " + (s.funguje ? "ano" : "ne"));
            }
        }

        public void vypisNefungujici() {
            for (Stroj s : stroje) {
                if (!s.funguje)
                    System.out.println("Stroj " + s.nazev + ", pocet vyrobku "  + s.pocetVyrobku + ", funguje " + (s.funguje ? "ano" : "ne"));
            }
        }

        public void vypisVyrobku() {
            int all = 0;
            for (Stroj s : stroje) {
                if (!s.funguje) //nikde neni uvedeno zda to ma byt vcetne nefunkcnich stroju, takze logicky bez
                    all += s.pocetVyrobku;
            }
            System.out.println("Celkovy pocet vyrobku je " + all);
        }

    }

    public class Stroj {

        protected String nazev;

        protected int pocetVyrobku;

        protected Boolean funguje;

        public Stroj(String n, int pV, boolean f) {
            nazev = n;
            pocetVyrobku = pV;
            funguje = f;
        }

    }

}
