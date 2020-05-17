package Lesson27;
import java.io.*;

public class Test8 {
   static StringBuilder abc() {
       StringBuilder a = new StringBuilder("privet");

        try {
            File f = new  File("index001.txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Ex poiman");
            System.out.println("a v catch bloke = " + a);
            return a;
        } finally {
            a.append("!!!!!!!!!!!!!!!!!");
            System.out.println("eto block finally");
            System.out.println("a v finally bloke = " + a);

        }
       return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
