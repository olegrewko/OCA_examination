package Lesson30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test10 {
    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);
    }
    static int abc(){
        try{
            FileInputStream fis = new FileInputStream("index.txt");
                    } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return 17;

        } finally {
            System.out.println("eto finally block");
            return 16;
        }
//        System.out.println("Programma go");
//        return 18;
    }

}
