package IgorDolgov;

import java.util.Scanner;

public class IndexMassBody {
    static float roost, ves, index;
    static String s, s1;

    public static void main (String[] args) {
        String s1 = imb();
        System.out.println(s1);

    }

    private static String imb () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой рост в метрах(00,0) и вес в килограммах(000,0) через пробел");
        float roost = scanner.nextFloat();
        float ves = scanner.nextFloat();
        index = ves / (roost * roost);
        if (index < 16) s = "Дефицит массы";
        else if (index >= 16 && index < 20) s = "Недостаточный вес";
        else if (index >= 20 && index < 25) s = "Норма";
        else if (index >= 25 && index < 30) s = "Предожирение";
        else if (index >= 30 && index < 35) s = "Первая степень ожирения";
        else if (index >= 35 && index < 40) s = "Вторая степень ожирения";
        else s = "Морбидное ожирение";
        return s;
    }

}
