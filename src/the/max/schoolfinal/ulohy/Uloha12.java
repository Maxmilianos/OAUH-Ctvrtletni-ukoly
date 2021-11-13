package the.max.schoolfinal.ulohy;

import the.max.schoolfinal.utils.Utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Uloha12 {

    public void start() {
        Losovani l = new Losovani();
        for (Integer i : l.random())
            System.out.print(i);
    }

    public class Losovani {

        public Losovani() {

        }

        public Set<Integer> random() {
            Set<Integer> s = new HashSet<Integer>();
            while (s.size() < 8) {
                s.add(Utils.r.nextInt(10));
            }
            return s;
        }

    }

}
