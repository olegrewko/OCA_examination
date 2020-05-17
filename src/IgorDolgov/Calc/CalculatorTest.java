package IgorDolgov.Calc;

import java.util.Scanner;

import static IgorDolgov.Calc.CalculatorEnd.calculated;
import static IgorDolgov.Calc.CalculatorEnd.operation;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        CalculatorEnd cA = new CalculatorEnd();
//        CalculatorRoman cR = new CalculatorRoman();
        System.out.println("Выберите тип калькулятора(a-арабский/r-римский): a/r");


        String uservb = scanner.nextLine();
        if (uservb.equals("a")) {
            CalculatorEnd cA = new CalculatorEnd();
            do {
                int num1 = cA.number();
                cA.op = operation();
                int num2 = cA.number();
                int result = calculated(num1, num2, cA.op);
                System.out.println(num1 + " " + cA.op + " " + num2 + " = " + result);

                System.out.println("Начать заново?(y/n)");
                cA.answer = scanner.nextLine();
                if (!"y".equals(cA.answer) && !"y".equals(cA.answer)) {
                    System.out.println("Работа программы завершена");
                    return;
                }
            } while ("n".equals(cA.answer) || "y".equals(cA.answer));
        }
        if (uservb.equals("r")) {
            CalculatorRoman cR = new CalculatorRoman();
            do {
                int num1 = cR.number();
                cR.op = operation();
                int num2 = cR.number();
                int result = calculated(num1, num2, cR.op);
                System.out.println(num1 + " " + cR.op + " " + num2 + " = " + result);

                System.out.println("Начать заново?(y/n)");
                cR.answer = scanner.nextLine();
                if (!"y".equals(cR.answer) && !"y".equals(cR.answer)) {
                    System.out.println("Работа программы завершена");
                    return;
                }
            } while ("n".equals(cR.answer) || "y".equals(cR.answer));


        }
    }
}

