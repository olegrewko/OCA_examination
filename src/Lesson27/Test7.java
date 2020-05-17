package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("index001.txt");
            System.out.println("object file sozdalsia");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsia");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Information chitartsya");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exseption 1");
        } catch (IOException e) {
            System.out.println("Exseption 2");
        } finally {
            System.out.println("eto fonally");
        }
    }
}
