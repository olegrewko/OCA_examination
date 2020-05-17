package IgorDolgov;

import java.util.Arrays;
import java.util.Scanner;

public class VariantXOX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Упражнение 6");

        // Символ, которым заполним пустое поле
        final char BLANK_SYMBOL = '-';
        // Определим размер таблицы, например 3 на 3
        final int ROW_SIZE = 3;
        // создадим массив символов под размер таблицы
        char[] field = new char[ROW_SIZE * ROW_SIZE];

        // Заполняем поле символом с подчеркиванием в цикле
        for (int i = 0; i < field.length; i++) {
            field[i] = BLANK_SYMBOL;
        }
        // Или можем это сделать с помощью библиотечного метода Arrays.fill();
        // которому передается массив для заполнения первым параметром и символ для заполнения вторым параметром
        Arrays.fill(field, BLANK_SYMBOL);

        while (true) {
            // Выводим поле на экран
            for (int i = 0; i < field.length; i++) {
                System.out.print(field[i] + "  ");
                if ((i + 1) % ROW_SIZE == 0) {
                    System.out.println();
                }
            }

            // В userInput сохраним номер ячейки, который ввел пользователь
            int userInput = -1; // по умолчанию присвоим, например, -1
            // будем крутиться в вечном цикле, пока пользователь не введет все так, как положено
            do {
                System.out.print("Выберите номер ячейки (от 1 до " + ROW_SIZE * ROW_SIZE + ", кроме занятых) или 0 для выхода ");
                userInput = scanner.nextInt();
                // считываем перевод строчки, чтобы очистить буффер
                // иначе он из буффера прочитается при следующем вводе символа
                scanner.nextLine();
                // здесь хитрое сравнение
                // если пользователь введет 0, то мы выйдем из цикла и не будем проверять остаток условия
                // если введет меньше 1 или больше 9, то тоже выйдем из цикла
                // и не будем лезть в массив field[userInput - 1]
                // поэтому не выйдем за его пределы
            } while (!(userInput == 0 ||
                    (userInput >= 1 && userInput <= ROW_SIZE * ROW_SIZE && field[userInput - 1] == BLANK_SYMBOL)));

            // Выходим, если пользователь ввел 0
            if (userInput == 0) {
                break;
            }

            // В цикле спрашиваем до тех пор, пока пользователь не введет какую-то букву
            // Если он просто нажмет Enter попросим ввести еще раз
            // Обратите внимание, что в этом цикле мы используеум конструкцию do-while
            // Так код получается более лаконичным
            String line;
            do {
                System.out.println("Введите символ, который надо поставить в ячейку ");
                line = scanner.nextLine();
            } while (line.isEmpty());

            // Если бы мы не проверяли на пустой ввод выше в цикле, то здесь могла бы произойти ошибка
            field[userInput - 1] = line.charAt(0);
        }
// Завершение цикла while(true){}
    }
}
