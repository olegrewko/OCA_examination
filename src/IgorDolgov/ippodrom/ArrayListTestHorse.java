package IgorDolgov.ippodrom;

import java.util.ArrayList;

public class ArrayListTestHorse {
    public static void main (String[] args) {
        ArrayList<String> horses = new ArrayList<>();
        horses.add("0#Быстрый");
        horses.add("1#Умный");
        horses.add("2#Серый");
        horses.add("3#Круг");
        horses.add("4#Виктор");
        System.out.println(horses);
        ArrayList<String> array1 = new ArrayList<String>(); // имена лошадей
        ArrayList<Integer> array2 = new ArrayList<>(); // ссылки
        for (int i = 0; i < 5; i++) {
            array2.add(i);
        }
        System.out.println(array2);
        int index = 0;
        String hint = horses.get(index);

        System.out.println(hint);

    }

    public static class Horse {
        int id;
        String name;
        int ves;
        int vozrast;

        public Horse (int id, String name, int ves, int vozrast) {
            this.id = id;
            this.name = name;
            this.ves = ves;
            this.vozrast = vozrast;

        }

        public String toString () {

            return "#" + id + " " + name;
        }
    }

}
