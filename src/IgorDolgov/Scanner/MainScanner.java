package IgorDolgov.Scanner;

import java.util.Arrays;

public class MainScanner {
    static int j = 5;
    static void abc(int i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        abc(j++);
        System.out.println(j);
        int a = 0;
        int b = 0;
        int x = 0;
        a = x++ + x++;
        b = ++x + ++x;
        System.out.println(a + " " + x);
        System.out.println(a + " " + x);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i = sc.nextInt();
//        sc.nextLine();
//        System.out.println(i);
//        System.out.println("Введите строку");
//        String s = sc.nextLine();
//        System.out.println(s);
        String string = "hello";
        System.out.println(string);
        char[] chars = string.toCharArray();
        System.out.println("Так выводится массив символов" + chars);
        System.out.println(Arrays.toString(chars));
        String str = "1 2 3";
        System.out.println(str);
        String[] result = str.split(" ");
// Теперь result хранит "1", "2", "3"
        System.out.println(Arrays.toString(result));

    }
}
