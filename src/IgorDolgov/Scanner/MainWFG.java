package IgorDolgov.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class MainWFG {
    static char userLetter;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Упражнение 5 Слово для угадывания");

        String wordForGuessing;

        int currentPlayer = 1;

        while (true) {
            System.out.println("Игрок " + currentPlayer + " введите загаданное слово");
            wordForGuessing = scanner.nextLine();
            // выходим из игры, если введен 0

            // Метод wordForGuessing.toCharArray() можно вызвать у любой строки
            // он любую строку может превратить в массив символов
            char[] wordForGuessingChar = wordForGuessing.toCharArray();
//            guessWord(wordForGuessing.toCharArray());
            guessWord(wordForGuessingChar);
            // Если вы помните тернарный оператор из 3-го занятия,
            // то можно сделать так
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

    }
//Метод отгадай слово принимает в параметр символьный массив wordForGuessingChar
    private static void guessWord(char[] wfg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте слово из " + wfg.length + " букв");

        // для разгадывания слова делаем такого же размера массив символов
        // и заполняем его подчеркиваниями, раз пока ни одной буквы не угаданно
        char[] guessedWord = new char[wfg.length];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        // обнуляем счетчик попыток
        int tryCount = 0;
        // крутимся в цикле, пока массивы не совпадают, помним, что знак ! – это частичка "НЕ",
        // которая означает отрицание
        // Arrays.equals() – позволяет сравнить два массива, возвращает true, если они совпадают
        while (!Arrays.equals(guessedWord, wfg)) {
            tryCount = tryCount + 1;
            System.out.println("Попытка " + tryCount);
            System.out.println(guessedWord);
            System.out.println("Введите букву (или 0 для выхода)");

            String userInput = scanner.nextLine();
            char userLetter;
            // здесь программа может сломаться, если пользователь не введет никакое число
            // а просто нажмет Enter
           userLetter = userInput.charAt(0);

            // выходим из игры, если введен 0
            if (userLetter == '0') {
                break;
            }

            // перебираем все буквы в слове
            for (int i = 0; i < wfg.length; i++) {
                // проверяем, есть ли такая буква в загаданном слове
                if (wfg[i] == userLetter) {
                    // меняем знак _ на угаданную букву
                    guessedWord[i] = userLetter;
                }
            }
        }

//Затем проверяем на равенство массивы
        if (Arrays.equals(guessedWord, wfg)) {
            System.out.println("Слово " + String.valueOf(wfg) + " отгадано за " + tryCount + " попыток");
        } else {
            System.out.println("Попробуйте еще раз");
        }
    }
}


