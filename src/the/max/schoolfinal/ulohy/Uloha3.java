package the.max.schoolfinal.ulohy;

import the.max.schoolfinal.utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;

public class Uloha3 {

    public void start() {
        Sportka s = new Sportka();
        s.vybratHracoviCisla();
        s.nextRound(); //simulace jednoho kola
        int count = 0; //pocet pokusu
        while (!s.checkWin()) { //simulace stalych vyher
            s.nextRound();
            System.out.println("Spravnych cisel: " + s.spravnychCisel());
            count ++;
        }
        System.out.println("Hrac vyhral na " + count + " pokus!");
        s.drawStatistic();
    }

    public class Sportka {

        protected HashSet<Integer> hracoviCisla = new HashSet<Integer>(), cisla = new HashSet<Integer>();

        public Sportka() {

        }

        public void vybratHracoviCisla() {
            hracoviCisla.clear();
            while (hracoviCisla.size() != 6) {
                hracoviCisla.add(Utils.getRandomNumber(1, 49));
            }
        }

        public void nextRound() {
            cisla.clear();
            while (cisla.size() != 6) {
                cisla.add(Utils.getRandomNumber(1, 49));
            }
        }

        public boolean checkWin() {
            return spravnychCisel() >= 3;
        }

        public int spravnychCisel() {
            int sp = 0;
            for (int hracCislo : hracoviCisla) {
                for (int vyherCislo : cisla) {
                    if (hracCislo == vyherCislo) {
                        sp ++;
                    }
                }
            }
            return sp;
        }

        public void drawStatistic() {
            System.out.print("Hracovi cisla: ");
            for (int i : hracoviCisla) {
                System.out.print(i + " ");
            }
            System.out.println("");
            System.out.print("Vyherni cisla: ");
            for (int i : cisla) {
                System.out.print(i + " ");
            }
        }
    }

}
