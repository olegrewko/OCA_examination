package comC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



public class ReadFileInt {
    public static void main (String[] args) throws FileNotFoundException {
//        String separator = File.separator;
        String path = "C:\\Users\\user\\IdeaProjects\\OCA_examination\\index01.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
       String line = scanner.nextLine();
       String[] numbersStr = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
       for(String number : numbersStr) {
          numbers[counter++] = Integer.parseInt(number);
       }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}