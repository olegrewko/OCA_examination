package HomeworkLesson29.Calc.JAVACalculated.Calc;
import JAVACalculated.Calc.CalculatorArabian;

import java.util.Scanner;
public class CalculatorRoman extends CalculatorArabian {
    static Scanner scanner = new Scanner(System.in);
    public static String answer;
    public static void main(String[] args) {
        do {
            int num1 = number();
            char op = operation();
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
        } while ("y".equals(answer) || "y".equals(answer));
    }
        public static int number () {
            System.out.println("Введите римскую цифру от I до Х ");
            String userdata = scanner.nextLine();
            if (userdata.equals("I")) {
                return 1;
            } else if (userdata.equals("II")) {
                return 2;
            } else if (userdata.equals("III")) {
                return 3;
            } else if (userdata.equals("IV")) {
                return 4;
            } else if (userdata.equals("V")) {
                return 5;
            } else if (userdata.equals("VI")) {
                return 6;
            } else if (userdata.equals("VII")) {
                return 7;
            } else if (userdata.equals("VIII")) {
                return 8;
            } else if (userdata.equals("IX")) {
                return 9;
            } else if (userdata.equals("X")) {
                return 10;
            } else {
                return -1;
            }
        }
    }

