package Lesson20;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Lesson20ArrayList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList();
        list.add("poka");
        list.add("privet");
        Car002 c = new Car002();

        list.add("ok");
        list.add(1,"hello");
        for(String s:list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3));
        list.set(2, "!!!");
        for(String s:list) {
            System.out.print(s + " ");
        }
        ArrayList <String> list2 = new ArrayList();
        list2.add("petrov");
        list2.add("sidorov");
        list2.add("ivanov");
        list.addAll(list2);
        System.out.println();
        for(String s:list) {
            System.out.print(s + " ");
        }
        System.out.println("---------");
        System.out.println(list.get(0));










    }
}

