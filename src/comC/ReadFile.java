package comC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main (String[] args) throws FileNotFoundException {
//        String separator = File.separator;
        String path = "C:\\Users\\user\\IdeaProjects\\OCA_examination\\index02.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {

            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}