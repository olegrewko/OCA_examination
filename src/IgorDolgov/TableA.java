package IgorDolgov;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TableA {
    public static void main (String[] args) throws IOException {
        for (int i = 1; i < 10; i++) {
            String s = " ";
            for (int j = 2; j < 6; j++) {
                s += (Integer.toString(i) + " * " + Integer.toString(j) + " = " + Integer.toString(i * j) + "\t\t");
            }


            System.out.println(s);
            File file = new File("index01.txt");
            PrintWriter sw = new PrintWriter(file);
            sw.println(s.length());
//            FileWriter pw = new FileWriter("index01.txt");
//            pw.write(s.length());

            sw.close();

        }
        File file = new File("index01.txt");
        Scanner scanner = new Scanner(file);
        int x = scanner.nextInt();
        char[] filledArray = new char[x + 10];
        Arrays.fill(filledArray, '-');
        System.out.println(filledArray);
        scanner.close();
        for (int i = 2; i < 10; i++) {
            String s = " ";
            for (int j = 6; j < 10; j++) {
                s += (Integer.toString(i) + " * " + Integer.toString(j) + " = " + Integer.toString(i * j) + "\t\t");
            }
            System.out.println(s);
        }
    }
}
