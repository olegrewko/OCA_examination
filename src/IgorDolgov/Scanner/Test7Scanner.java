package IgorDolgov.Scanner;

import java.util.Scanner;

public class Test7Scanner {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println(i);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        System.out.println(s);

        System.out.println("Введите число");
        int i2 = sc.nextInt();
        System.out.println(i2);
    }
}
