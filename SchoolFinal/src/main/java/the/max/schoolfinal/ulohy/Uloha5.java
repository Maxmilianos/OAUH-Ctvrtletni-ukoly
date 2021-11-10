/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.max.schoolfinal.ulohy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author holomek_maxmilian
 */
public class Uloha5 {
    
    private static Random r = new Random();
    
    public void start() {
        Anketa a = new Anketa();
        for (int i = 0; i<10; i++) {
            HlasovaciListek l = new HlasovaciListek(i);
            for (int ii = 0; ii<=5; ii++) {
                l.odpovez(ii, 1 + r.nextInt(5));
            }
        }
        for (int i = 0; i<10; i++) {
            a.zobrazListek(i);
        }
    }
    
    public class HlasovaciListek {
        
        protected int id;
        
        protected HashMap<Integer, Integer> answers;
        
        public HlasovaciListek(int id/*, int[] answers*/) {
            this.id = id;
            /*for (int i = 1; i <= answers.length; i++) {
                this.answers.put(i, answers[i]);
            }*/
        }
        
        public void odpovez(int question, int answer) {
            if (answer < 1 && answer > 5) {
                System.out.println("Neplatne hlasovaci - cislo " + answer);
                return;
            }
            answers.put(question, answer);
        }
        
        public int vratOdpoved(int cisloOtazky) {
            return (answers.containsKey(cisloOtazky) ? answers.get(cisloOtazky) : 0);
        }
        
    }
    
    public class Anketa {
        
        protected ArrayList<HlasovaciListek> list = new ArrayList<HlasovaciListek>();
        
        public Anketa() {
            
        }
        
        public void zobrazListek(int id) {
            HlasovaciListek l = vratListek(id);
            if (l == null) {
                System.out.println("Listek nebyl nalezen.");
                return;
            }
            System.out.println("ID: " + id);
            for (Integer question : l.answers.keySet()) {
                System.out.print("Otazka " + question + ": ");
                int answer = l.answers.get(question);
                for (int i = 1; i <= 5; i++) {
                    if (answer == i) {
                        System.out.print("X ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
                System.out.println("");
            }
        }
        
        public HlasovaciListek vratListek(int id) {
            for (HlasovaciListek li : list) {
                if (li.id == id) {
                    return li;
                }
            }
            return null;
        }
        
        public void vypisStatistiku() {
            for (int i = 1; i <= 8; i++) {
                int p = 0, a = 0;
                for (HlasovaciListek li : list) {
                    int aa = li.vratOdpoved(i);
                    p += aa;
                    if (aa != 0)
                        a += 1;
                }
                System.out.println("Otazka " + i + ": " + (double) (p / a));
            }
        }
        
    }
    
}
