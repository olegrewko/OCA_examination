package JAVACalculated;

import java.util.Scanner;

public class CalculatorConsole {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String answer, symbol;
        float num1 = 0, num2 = 0, result = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Первое число:");
            try {
                num1 = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("Некорректное значение");
                return;
            }
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Знак:");
            symbol = sc2.nextLine();
            if (!"+".equals(symbol) && !"-".equals(symbol) && !"*".equals(symbol) && !"/".equals(symbol)) {
                System.out.println("Некорректный символ");
                return;
            }
            System.out.println("Второе число:");
            try {
                num2 = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("Некорректное значение");
                return;
            }
            switch (symbol) {
                case "+":
                    result = plus(num1, num2);
                    break;
                case "-":
                    result = minus(num1, num2);
                    break;
                case "*":
                    result = multiPlus(num1, num2);
                    break;
                case "/":
                    result = multiMinus(num1, num2);
                    break;
                default:
                    break;
            }
            System.out.println(num1 + symbol + num2 + "=" + result);
            Scanner scAns = new Scanner(System.in);
            System.out.println("Начать заново?(y/n)");
            answer = scAns.nextLine();
            if (!"y".equals(answer) && !"y".equals(answer)) {
                System.out.println("Работа программы завершена");
                return;
            }
        } while ("n".equals(answer) || "y".equals(answer));
    }

    static float plus(float a, float b) {
        return a + b;
    }

    static float multiPlus(float a, float b) {
        return a * b;
    }

    static float minus(float a, float b) {
        return a - b;
    }

    static float multiMinus(float a, float b) {
        return a / b;
    }
}