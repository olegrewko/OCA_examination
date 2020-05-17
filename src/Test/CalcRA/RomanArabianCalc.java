package Test.CalcRA;
/**
 * Написать Римско-Арабский консольный калькулятор чтобы он сам распознавал нужные символы и выдавал  ответ
 * Вот это написал уже работает
 * Помогите плиз отладить чтоб идеально работал
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class RomanArabianCalc {
    static Scanner scanner = new Scanner(System.in);

    static int number1, number2, number10, number20;
    static char operation;
    static int result, result2;

    static String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};


    public static void main (String[] args) {

        System.out.println("Введите выражение  [2+2=] или [V+V=] + Enter ");
//      Считываем строку userInput которую ввёл пользователь
        String userInput = scanner.nextLine();
//      Создаём пустой символьный массив длиной 10 символов:  under_char
        char[] under_char = new char[10];
//      Заполняем символьный массив символами строки которую ввел пользователь и по ходу ловим знак операции
        for (int i = 0; i < userInput.length(); i++) {
            under_char[i] = userInput.charAt(i);
            if (under_char[i] == '+') {
                operation = '+';
            }
            if (under_char[i] == '-') {
                operation = '-';
            }
            if (under_char[i] == '*') {
                operation = '*';
            }
            if (under_char[i] == '/') {
                operation = '/';
            }

        }

//        Конвертируем символьный массив в строковый массив чтобы методом split разделить на две подстроки
        String under_charString = String.valueOf(under_char);
        String[] block01 = under_charString.split("[+-/*=]");
        System.out.println("---Получили  две строки в массиве---");
        System.out.println(Arrays.toString(block01));
        System.out.println(block01[0]);
        System.out.println(block01[1]);

        number1 = romanToNumber(block01[0]);
        number2 = romanToNumber(block01[1]);


        result = calculated(number1, number2, operation);
        System.out.println("---Результат для римских цифр-----");
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);


        number10 = Integer.parseInt(block01[0]);
        number20 = Integer.parseInt(block01[1]);
        result2 = calculated(number10, number20, operation);
        System.out.println("--Результат для арабских цифр------");
        System.out.println(number10 + " " + operation + " " + number20 + " = " + result2);

    }

    private static int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }


    public static int calculated (int num1, int num2, char op) {
        int result = 0;
        switch (op) {
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
                    System.out.println("Only integer non-zero parameters allowed");
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}
