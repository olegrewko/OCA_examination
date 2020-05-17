package Test.JAVACalculated.Calc;

import java.util.Scanner;



public class CalculatorRoman extends CalculatorArabian {
    static Scanner scanner = new Scanner(System.in);
    public static char op;
    static String answer;
    public static void main(String[] args) {
        do {
            int num1 = number();
            op = operation();
            int num2 = number();
            int result = calculated(num1, num2, op);
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Начать заново?(y/n)");
            answer = scanner2.nextLine();
            if (!"y".equals(answer) && !"y".equals(answer)) {
                System.out.println("Работа программы завершена");
                return;
            }
        } while ("n".equals(answer) || "y".equals(answer));


    }

    public static int number() {
        System.out.println("Введите римскую цифру от I до Х ");

        String userroman = scanner.nextLine();
        if (userroman.equals("I")) {
            return 1;
        } else if (userroman.equals("II")) {
            return 2;
        } else if (userroman.equals("III")) {
            return 3;
        } else if (userroman.equals("IV")) {
            return 4;
        } else if (userroman.equals("V")) {
            return 5;
        } else if (userroman.equals("VI")) {
            return 6;
        } else if (userroman.equals("VII")) {
            return 7;
        } else if (userroman.equals("VIII")) {
            return 8;
        } else if (userroman.equals("IX")) {
            return 9;
        } else if (userroman.equals("X")) {
            return 10;
        } else {


            return -1;

        }
    }


}
