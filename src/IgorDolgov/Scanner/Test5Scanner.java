package IgorDolgov.Scanner;

import java.util.Scanner;

public class Test5Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int i = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                break;
            } else {
                String temp = scanner.nextLine();
            }
        }
        System.out.println("echo" + i);
    }
}
