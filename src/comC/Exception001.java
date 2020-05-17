package comC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Exception001 {
    public static void main (String[] args)  {
//        String separator = File.separator;
        String path = "C:\\Users\\user\\IdeaProjects\\OCA_examination\\index02.txt";
        File file = new File(path);
        try {
                Scanner scanner = new Scanner(file);
             System.out.println("Программа продолжается");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        System.out.println("Программа продолжается");

    }
}
