package the.max.schoolfinal.ulohy;

public class Uloha2 {

    public void start() {
        Schematic c = new Schematic(1548, 12);
        System.out.println(c.toString());
        System.out.println("============");
        c.calculate();
    }

    public class Schematic {

        protected int a, b;

        public Schematic(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void calculate() {
            int max = Math.max(a, b), min = Math.min(a, b);
            String maxS = String.valueOf(max), minS = String.valueOf(min);
            //System.out.println(max + " " + min);
            for (int mins = minS.length(); mins >= 1; mins--) {
                /*for (int maxs = maxS.length(); maxs >= 1; maxs--) {
                    int i = 0;//Integer.valueOf(maxS.charAt(maxs-1)) * Integer.valueOf(minS.charAt(mins-1));
                    System.out.println(maxS.charAt(maxs-1) + " * " + minS.charAt(mins-1));
                    System.out.println(i);
                }*/
                int i = max * Integer.valueOf(String.valueOf(minS.charAt(mins-1)));
                System.out.print(i);
                System.out.println("");
            }
            System.out.println("============");
            System.out.println("" + max * min);
        }

        @Override
        public String toString() {
            return "Schematic{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

}
