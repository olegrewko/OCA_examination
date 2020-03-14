package Homework.Lesson20;
import java.util.*;
public class Lesson20 {
    public ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;

    }

    public static void main(String[] args) {
        Lesson20 l20 = new Lesson20();
        l20.abc("privet", "poka", "ok", "privet", "hello", "privet", "jk");
    }

}
