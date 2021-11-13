/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.max.schoolfinal.ulohy;

import the.max.schoolfinal.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author holomek_maxmilian
 */
public class Uloha4 {
    
    private static Random r = new Random();
    
    public void start() {
        List<Enemy> l = new ArrayList<Enemy>();
        for (int i = 0; i < 5; i++) {
            l.add(new Enemy(Utils.getRandomName(), r.nextInt(50), r.nextInt(50), 0));
        }
        Gun gun = new Gun(25, 25);
        gun.scan(l, 0);
    }
    
    public class Enemy {
        
        protected String name;
        
        protected int x, y, distance;
        
        public Enemy(String name, int x, int y, int distance) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    
    public class Gun {
        
        protected int x, y;
        
        public Gun(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public List<Enemy> scan(List<Enemy> enemies, int radius) {
            List<Enemy> l = new ArrayList<Enemy>();
            for (Enemy e : enemies) {
                /*double hX = Math.max(x, e.x), hY = Math.max(y, e.y),
                        mX = Math.min(x, e.y), mY = Math.min(y, e.y);
                double dis = Math.sqrt((hX+mX)*(hX-mX) + (y+e.y)*(y-e.y));*/
                double dis = Math.sqrt((x-e.x)*(x-e.x) + (y-e.y)*(y-e.y));
                System.out.println("Okey - (" + x + ", " + y + ") (" + e.x + ", " + e.y + ") - " + dis);
                if (dis <= radius) {
                    l.add(e);
                }
            }
            return l;
        }
        
    }
    
    
}
