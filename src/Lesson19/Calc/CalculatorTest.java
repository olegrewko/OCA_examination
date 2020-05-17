package Lesson19.Calc;





import JAVACalculated.Calc.CalculatorArabian;
import JAVACalculated.Calc.CalculatorRoman;

import java.util.Scanner;


import static Lesson4.Calc.CalculatorArabian.calculated;


public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);
    static String answer;
    public static void main(String[] args) { System.out.println("Выберите тип калькулятора(a-арабский/r-римский): a/r");
        String unnerve = scanner.nextLine();
        if (unnerve.equals("a")) {
            CalculatorArabian cA = new CalculatorArabian();
            do {
                int num1 = cA.number();
                cA.op = cA.operation();
                int num2 = cA.number();
                int result = cA.calculated(num1, num2, cA.op);
                if((cA.op == '/') & (num2 == 0)) {
                    System.out.println(num1 + " " + cA.op + " " + num2 + " = INFINITY" );
                } else {
                    System.out.println(num1 + " " + cA.op + " " + num2 + " = " + result);
                }
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Начать заново?(y/n)");
                answer = scanner2.nextLine();
                if (!"y".equals(answer) && !"y".equals(answer)) {
                    System.out.println("Работа программы завершена");
                    return;
                }
            } while ("y".equals(answer) || "y".equals(answer));
        }
            if (unnerve.equals("r")) {
                CalculatorRoman cR = new CalculatorRoman();
            do {
                int num1 = cR.number();
                char op = cR.operation();
                int num2 = cR.number();
                int result = calculated(num1, num2, cR.op);
                System.out.println(num1 + " " + cR.op + " " + num2 + " = " + result);
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Начать заново?(y/n)");
                answer = scanner2.nextLine();
                if (!"y".equals(answer) && !"y".equals(answer)) {
                    System.out.println("Работа программы завершена");
                    return;
                }
            } while ("n".equals(answer) || "y".equals(answer));
        }
    }
}
