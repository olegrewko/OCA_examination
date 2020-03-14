package Lesson4;

public class Summirovanie {

    int sum() {
        int result = 0;
        System.out.println("Сумма трех чисел: "+ result);
        return result;

    }
    int sum(int a) {
        int result1 = a;
        System.out.println("Сумма трех чисел: "+ result1);
        return result1;

    }
    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Сумма трех чисел: "+ result2);
        return result2;

    }

    int sum(int d, int e, int f ) {
        int result3 = d + e + f;
        System.out.println("Сумма трех чисел: " + result3);
        return result3;
    }
    int sum(int d, int e, int f, int g ) {
        int result4 = d + e + f + g;
        System.out.println("Сумма трех чисел: " + result4);
        return result4;
    }
}
class SummirovanieTest {

public static void main(String[]args){
        Summirovanie s = new Summirovanie();
        s.sum();
        s.sum(10);
        s.sum(10,20);
        s.sum(10,20,30);
        s.sum(10,20,30, 40);

        }
        }
