package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    void abc() throws FileNotFoundException {
        File f = new File("test9.txt");

//        try {
            FileInputStream fis = new FileInputStream(f);
//
            System.out.println("Vse horosho");
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Bil poiman exception " + e);
//        } finally {
//            System.out.println("Eto srabotart vsegda");
//
//        }
    }
        void def() throws FileNotFoundException {
//            System.out.println("privet");
//            try {
//            abc();
//        } catch (FileNotFoundException e) {
//        System.out.println("Bil poiman exception " + e);
            abc();
        }




    public static void main(String[] args) {
       Test4 t = new Test4();
//       t.def();
    }
    }

