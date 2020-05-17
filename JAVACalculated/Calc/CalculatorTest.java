package JAVACalculated.Calc;
import java.util.Scanner;
public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Выберите тип калькулятора(a-арабский/r-римский): a/r");
        String uservb = scanner.nextLine();
        if (uservb.equals("a")) {
            CalculatorArabian cA = new CalculatorArabian();
            do {
                int num1 = cA.number();
                char op = cA.operation();
                int num2 = cA.number();
                int result = calculated(num1, num2, op);
                System.out.println(num1 + " " + op + " " + num2 + " = " + result);
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
                int num2 = cR.number();
                System.out.println(num1 + " " + op + " " + num2 + " = " + result);
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