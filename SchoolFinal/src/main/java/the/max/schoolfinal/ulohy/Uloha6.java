/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.max.schoolfinal.ulohy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author holomek_maxmilian
 */
public class Uloha6 {
    
    public void start() {
        
    }
    
    public class Item {
        
        protected String nazev;
        
        protected int vaha, cena;
        
        public Item(String n, int v, int c) {
            nazev = n;
            vaha = v;
            cena = c;
        }
        
    }
    
    public class Batoh {
        
        protected int nosnost, pocetPozic;
        
        protected List<Item> list = new ArrayList<Item>();
        
        public Batoh(int n, int p) {
            //sss
            nosnost = n;
            pocetPozic = p;
        }
        
        public boolean pridejItem(Item i) {
            if (list.contains(i)) return false;
            if (getAktVaha() + i.vaha > nosnost) return false;
            if (getAktPozice() + 1 > pocetPozic) return false;
            list.add(i);
            return true;
        }
        
        public boolean odeberItem(Item i) {
            if (!list.contains(i))
                return false;
            list.remove(i);
            return true;
        }
        
        public boolean odeberItem(int pozice) {
            if (list.size() < pozice) return false;
            list.remove(pozice-1);
            return true;
        }
        
        public int getAktPozice() {
            return list.size();
        }
        
        public int getAktVaha() {
            int i = 0;
            for (Item it : list)
                i += it.vaha;
            return i;
        }
        
    }
    
}
