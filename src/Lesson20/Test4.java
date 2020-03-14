package Lesson20;
import java.util.ArrayList;
public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        StringBuilder sb3 = new StringBuilder("hello");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for(int i=0; i<list.size(); i++) {
            list.get(i).append("!!!");
        }
        for(StringBuilder sb:list) {
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.print(list.toString());
    }

}
