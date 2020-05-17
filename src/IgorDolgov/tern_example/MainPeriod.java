package IgorDolgov.tern_example;

import java.util.Scanner;

public class MainPeriod {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Упражнение 1");
            System.out.println("Введите 10 чисел");

            // Создали массив
            final int ELEMENTS_COUNT = 10;
            int[] array = new int[ELEMENTS_COUNT];

            // Заполним массив
            for (int i = 0; i < 10; i++) {
                System.out.print("Введите " + (i + 1) + " число: ");
                array[i] = scanner.nextInt();
            }

            // Отсортируем массив
            for (int i = 0; i < ELEMENTS_COUNT - 1; i++) {
                for (int j = i + 1; j < ELEMENTS_COUNT; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.print("Массив, упорядоченный по убыванию = [");
            for (int elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println("]");
        }
    }

