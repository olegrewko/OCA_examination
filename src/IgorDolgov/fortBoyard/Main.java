package IgorDolgov.fortBoyard;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        final int SIZE = 10;
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            array1.add("Card" + i);

        }
        System.out.println(array1);
        for (int i = 0; i < SIZE; i++) {
            array2.add(i);

        }
        System.out.println(array2);
        int index = 1;
        int hint = array2.get(index);
        System.out.println(hint);
        System.out.println(array1.get(hint));
        array2.remove(index);
        System.out.println(array1);
        System.out.println(array2);
        System.out.println("------------------");
        for (int i = array2.size()-1; i >=0 ; i--) {
            hint = array2.get(i);
            System.out.println(hint);
            System.out.println(array1.get(hint));
            array2.remove(i);
            System.out.println(array2);
            
        }
    }

}
