/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.max.schoolfinal.ulohy;

import java.util.HashMap;

/**
 *
 * @author holomek_maxmilian
 */
public class Uloha18 {
    
    public HashMap<Integer, Door> doors = new HashMap<Integer, Door>();
    
    public void start() {
        for (int i = 1; i <= 25; i++) {
            doors.put(i, new Door(true));
        }
        for (Integer i = 2; i < 5; i++) {
            for (Integer id : doors.keySet()) {
                Door d = doors.get(id);
                if (id % i == 0) {
                    d.change();
                }
                System.out.print(d.open ? "O" : "X");
            }
            System.out.println("");
        }
    }
    
    public class Door {
        
        protected boolean open;
        
        public Door(boolean o) {
            open = o;
        }
        
        public void change() {
            open = !open;
        }
        
    }
    
}
