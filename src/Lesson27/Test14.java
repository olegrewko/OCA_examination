package Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("file test9.txt sushestvuet");
            try {
                fis2.close();

            } catch (IOException e) {
                System.out.println("problemy");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test9 ne naiden");
        } catch (NullPointerException e) {
            System.out.println("Srabotal NullPointerEXC");
        }
    }

}
