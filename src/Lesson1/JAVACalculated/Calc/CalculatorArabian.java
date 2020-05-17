package Lesson1.JAVACalculated.Calc;


import java.util.InputMismatchException;
import java.util.Scanner;



public class CalculatorArabian {
    static Scanner scanner = new Scanner(System.in);
    public static int num1;
    public static  int num2;
    public static char op;
    public static int result;
    static String answer;
    public static void main(String[] args) {
        do {
            num1 = number();
            op = operation();
            num2 = number();
            result = calculated(num1, num2, op);
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
        System.out.println("Введите число");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Ошибка, попробуйте еще раз");
            scanner.next();
            num = number();
        }
        return num;
    }
    public static char operation() {
        System.out.println("Введите операцию: +, -, *, /");
        if(scanner.hasNext()){
            op = scanner.next().charAt(0);
        }else{
            System.out.println("Ошибка, попробуйте еще раз");
            scanner.next();
            op = operation();
        }
        return op;
    }
    public static int calculated(int num1, int num2, char op) {
        CalculatorArabian.op = op;
        int result = 0;
        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    scanner.nextLine();
                    System.out.println("Only integer non-zero parameters allowed");
                }
                break;
            default:
                System.out.println("Оператор не найден");
                result = calculated(num1, num2, operation());
        }
        return result;
    }
}
