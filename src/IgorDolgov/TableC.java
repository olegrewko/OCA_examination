package IgorDolgov;

import java.util.ArrayList;

public class TableC {

    static String s;

    public static void main (String[] args) {
        ArrayList t1 = multiline(2, 6);
        for (int i = 0; i < t1.size(); i++) {
            System.out.println(t1.get(i));

        }


        for (int i = 0; i < s.length(); i++)
            System.out.print("-");
        System.out.println();

        ArrayList t2 = multiline(6, 10);
        for (int i = 0; i < t2.size(); i++) {
            System.out.println(t2.get(i));
        }

    }


    public static ArrayList multiline (int from, int to) {
        ArrayList<String> table = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            s = " ";
            for (int j = from; j < to; j++) {
                s += (Integer.toString(j) + " * " + Integer.toString(i) + " = " + Integer.toString(i * j) + "\t\t");
            }
            table.add(s);
        }
        return table;
    }


}
