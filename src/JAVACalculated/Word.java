package JAVACalculated;

import java.util.Arrays;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Упражнение 4");

        // или полная запись вот так:
         char[] wordForGuessing = new char[]{'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        System.out.println("Отгадайте слово из " + wordForGuessing.length + " букв");
        StringBuilder str = new StringBuilder("***********stroka");
        StringBuilder str003 = str.reverse();
        System.out.println(str003);
        System.out.println(str003.indexOf("*"));

        // для разгадывания слова делаем такого же размера массив символов
        // и заполняем его подчеркиваниями, раз пока ни одной буквы не угаданно
//        char[] guessedWord = new char[wordForGuessing.length];
//        for (int i = 0; i < guessedWord.length; i++) {
//            guessedWord[i] = '_';
//        }
        char[] guessedWord = new char[wordForGuessing.length];
        Arrays.fill(guessedWord, '_');
        System.out.println(Arrays.toString(guessedWord));
        // обнуляем счетчик попыток
        int tryCount = 0;

        // крутимся в цикле, пока массивы не совпадают, помним, что знак ! – это частичка "НЕ",
        // которая означает отрицание
        // Arrays.equals() – позволяет сравнить два массива, возвращает true, если они совпадают
        while (!Arrays.equals(guessedWord, wordForGuessing)) {
            tryCount = tryCount + 1;
            System.out.println("Попытка " + tryCount);
            System.out.println(guessedWord);
            System.out.println("Введите букву (или 0 для выхода)");

            String userInput = scanner.nextLine();
            char userLetter;
            // здесь программа может сломаться, если пользователь не введет никакое число
            // а просто нажмет Enter
            //Выбрать символ с индексом 0 можно методом charAt(int index);
            userLetter = userInput.charAt(0);

            // выходим из игры, если введен 0
            if (userLetter == '0') {
                break;
            }

            // перебираем все буквы в слове
            for (int i = 0; i < wordForGuessing.length; i++) {
                // проверяем, есть ли такая буква в загаданном слове
                if (wordForGuessing[i] == userLetter) {
                    // меняем знак _ на угаданную букву
                    guessedWord[i] = userLetter;
                }
            }
        }

        if (Arrays.equals(guessedWord, wordForGuessing)) {
            System.out.println("Слово " + String.valueOf(wordForGuessing) + " отгадано за " + tryCount + " попыток");
        } else {
            System.out.println("Попробуйте еще раз");
        }
    }
}
