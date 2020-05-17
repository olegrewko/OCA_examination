package TC;
import java.util.*;
import java.util.Random;
public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "ноль");
        a.add(1,"один");
        a.add(2,"два");
        a.add(3,"три");
        printAL(a);
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }

public static void printAL(ArrayList<String> al) {
    for (String elem : al) {
        System.out.println(elem + " ");
    }
    System.out.println(" ");
}

}
