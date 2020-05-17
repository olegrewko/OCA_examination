package IgorDolgov;

import java.util.Scanner;

public class SeaBattle002 {
    public static void main (String[] args) {
        char cells[] = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int x;
        x = (int) (Math.random() * 9);
        cells[x] = '*';
        System.out.println(cells);

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Введите число от 0 до 9");
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                if (cells[i] == '.') {
                    System.out.println("Мимо");
                }
                if (cells[i] == '*') {
                    System.out.println("Попал");
                }
                if (i == '!') {
                    break;
                }
            } else {
                String temp = scanner.nextLine();
            }
            if (i == '!') {
                break;
            }

        }
    }
}
