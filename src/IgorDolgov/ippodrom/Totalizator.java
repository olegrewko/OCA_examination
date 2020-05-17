package IgorDolgov.ippodrom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Totalizator {
    private static int odinar2[] = new int[2];
    private static int[] a = new int[4];
    private static int[] p = new int[2];
    private static int[] exp4 = new int[4];
    private static int[] ez = new int[2];

    //Метод сортировки массива от max к min
    private static int[] sortMaxMin (int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //Метод randomArrayGenerator(n, m); выводит n-ое кол-во случайных чисел от 0 до m
    //Метод генерации (int arrayLength) - случайных чисел от 0 до (int upperBound)
    private static int[] randomArrayGenerator (int arrayLength, int upperBound) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBound);
        }
        return array;
    }

    //Метод преобразования массива String[] в массив int[]
    public static int[] strArrayToIntArray (String[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }

    //Использовать так
//int[] arr = strArrayToIntArray(/*YOUR STR ARRAY*/);
    public static void main (String[] args) {
        System.out.println("Тусклая жизнь нормального, среднего человека хуже, чем смерть.Ч.Буковски");
        System.out.println("Виды игр на тотализаторе Чарлзу Буковски посвящаю эту программу");
        System.out.println("Лошади и номера участвующие в 13 забегах на 5 фарлонгов(1942г Лос-Анжелес ипподром Голливуд Парк");
        ArrayList<String> horses = new ArrayList<>();
        horses.add("[0]Агат");
        horses.add("[1]Умный");
        horses.add("[2]Серый");
        horses.add("[3]Круг");
        horses.add("[4]Бандит");
        System.out.println(horses);
        System.out.println("#1 Одинар 2 Необходимо указать победителя в двух заездах подряд");
        System.out.println("#2 Дважды-два Необходимо указать по две лошади первую и вторую в двух заездах подряд");
        System.out.println("#3 Парный Необходимо указать две первые лошади в одном заезде независимо от их последовательности прихода к финишу");
        System.out.println("#4 Экспресс-4 Необходимо указать победителя, второго, третьего и четвертого призеров обязательно по порядку прихода к финишу");
        System.out.println("#5 Экзакта: Ставка на двух лошадей которые придут 1,2 или 3 в любой последовательности");
        System.out.println();
        System.out.println("Выберите вид игры: введите от одной до пяти цифр [1-5]через пробел");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] bloksInput = userInput.split(" ");
        System.out.println(Arrays.toString(bloksInput));
        for (int i = 0; i < bloksInput.length; i++) {
            switch (bloksInput[i]) {
                case "1":
                    System.out.println("#1 Одинар 2: Необходимо указать победителей в двух заездах подряд");
                    System.out.println("#1 Одинар 2: Введите порядковый номер лошади[0-4] [0-4]");

                    odinar2[0] = scanner.nextInt();
                    odinar2[1] = scanner.nextInt();
                    System.out.println(Arrays.toString(odinar2));
                    break;
                case "2":
                    System.out.println("#2 Дважды-два: Введите два порядковых номера призеров в двух заездах подряд через пробел [0-4] [0-4] [0-4] [0-4]");

                    a[0] = scanner.nextInt();
                    a[1] = scanner.nextInt();
                    a[2] = scanner.nextInt();
                    a[3] = scanner.nextInt();
                    System.out.println(Arrays.toString(a));
                    break;
                case "3":
                    System.out.println("#3 Парный: Укажите две первые лошади в одном заезде независимо от их последовательности прихода к финишу [0-4] [0-4]");

                    p[0] = scanner.nextInt();
                    p[1] = scanner.nextInt();
                    System.out.println(Arrays.toString(p));
                    break;
                case "4":
                    System.out.println("#4 Экспресс-4 Необходимо указать победителя, второго, третьего и четвертого призеров" +
                            " обязательно по порядку прихода к финишу в одном заезде [0-4] [0-4] [0-4] [0-4]");

                    exp4[0] = scanner.nextInt();
                    exp4[1] = scanner.nextInt();
                    exp4[2] = scanner.nextInt();
                    exp4[3] = scanner.nextInt();
                    System.out.println(Arrays.toString(exp4));
                    break;
                case "5":
                    System.out.println("#5 Экзакта: Ставка на двух лошадей которые придут 1,2,3 в одном заезде в любой последовательности[0-4] [0-4]");

                    ez[0] = scanner.nextInt();
                    ez[1] = scanner.nextInt();
                    System.out.println(Arrays.toString(ez));
                    break;
            }
        }
        IppodromPlay();
    }

    public static void IppodromPlay () {
        ArrayList<String> tableString = new ArrayList<>();
//racetrack - кол-во заездов на ипподроме
        int racetrack = 14;
        int numOfHorses = 5;//Кол-во лошадей в забеге фиксированная величина для увеличения добавить переменные a, b и hint_a
        for (int n = 0; n < racetrack; n++) {
            int[] array01 = randomArrayGenerator(numOfHorses, 1750);
//            System.out.println(Arrays.toString(array01));
            ArrayList<Integer> arrayL1 = new ArrayList<>();
            for (int i = 0; i < numOfHorses; i++) {
                arrayL1.add(array01[i]);
            }
//            System.out.println(arrayL1);
            int[] sortedArray01 = sortMaxMin(array01);
//            System.out.println(Arrays.toString(sortedArray01));
            ArrayList<Integer> arrayLsorted01 = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                arrayLsorted01.add(sortedArray01[i]);
            }
//            System.out.println(arrayLsorted01);
            int a = arrayLsorted01.get(0);
            int b = arrayLsorted01.get(1);
            int c = arrayLsorted01.get(2);
            int d = arrayLsorted01.get(3);
            int e = arrayLsorted01.get(4);
            int hint_a = arrayL1.indexOf(a);
            int hint_b = arrayL1.indexOf(b);
            int hint_c = arrayL1.indexOf(c);
            int hint_d = arrayL1.indexOf(d);
            int hint_e = arrayL1.indexOf(e);
            int[] hintArray = new int[]{hint_a, hint_b, hint_c, hint_d, hint_e};

            String s = "";
            s += (Integer.toString(hint_a) + " " + Integer.toString(hint_b) + " " + Integer.toString(hint_c) + " " + Integer.toString(hint_d) + " " + Integer.toString(hint_e));
            tableString.add(s);
            System.out.println(Arrays.toString(hintArray) + " --------- Результат " + n + " заезда");

        }
//        System.out.println(tableString);

        String[] resultMassiv00 = tableString.get(0).split(" ");
        String[] resultMassiv01 = tableString.get(1).split(" ");
        String[] resultMassiv02 = tableString.get(2).split(" ");
        String[] resultMassiv03 = tableString.get(3).split(" ");
        String[] resultMassiv04 = tableString.get(4).split(" ");
        String[] resultMassiv05 = tableString.get(5).split(" ");
        String[] resultMassiv06 = tableString.get(6).split(" ");
        String[] resultMassiv07 = tableString.get(7).split(" ");
        String[] resultMassiv08 = tableString.get(8).split(" ");
        String[] resultMassiv09 = tableString.get(9).split(" ");
        String[] resultMassiv10 = tableString.get(10).split(" ");
        String[] resultMassiv11 = tableString.get(11).split(" ");
        String[] resultMassiv12 = tableString.get(12).split(" ");
        String[] resultMassiv13 = tableString.get(13).split(" ");

        int[] intarray00 = strArrayToIntArray(resultMassiv00);
        int[] intarray01 = strArrayToIntArray(resultMassiv01);
        int[] intarray02 = strArrayToIntArray(resultMassiv02);
        int[] intarray03 = strArrayToIntArray(resultMassiv03);
        int[] intarray04 = strArrayToIntArray(resultMassiv04);
        int[] intarray05 = strArrayToIntArray(resultMassiv05);
        int[] intarray06 = strArrayToIntArray(resultMassiv06);
        int[] intarray07 = strArrayToIntArray(resultMassiv07);
        int[] intarray08 = strArrayToIntArray(resultMassiv08);
        int[] intarray09 = strArrayToIntArray(resultMassiv09);
        int[] intarray10 = strArrayToIntArray(resultMassiv10);
        int[] intarray11 = strArrayToIntArray(resultMassiv11);
        int[] intarray12 = strArrayToIntArray(resultMassiv12);
        int[] intarray13 = strArrayToIntArray(resultMassiv13);


        int[][] intdoubleAr = new int[][]{intarray00, intarray01, intarray02, intarray03, intarray04, intarray05,
                intarray06, intarray07, intarray08, intarray09, intarray10, intarray11, intarray12, intarray13};

//        System.out.println(Arrays.deepToString(intdoubleAr));
        for (int m = 0; m < racetrack; m++) {
            if ((odinar2[0] == intdoubleAr[m][0]) && (odinar2[1] == intdoubleAr[m + 1][0])) {

                System.out.println("Выигрыш в Одинаре2 в ------ " + m + " и " + (m + 1) + " заездах ----- ");
                if (((a[0] == intdoubleAr[m][0]) && (a[1] == intdoubleAr[m][1])) ||
                        ((a[2] == intdoubleAr[m + 1][0]) && (a[3] == intdoubleAr[m + 1][1]))) {
                    System.out.println("Выигрыш в Дваждыдва в ---- " + m + " и " + (m + 1) + " заездах ----- ");
                }

                if (((p[0] == intdoubleAr[m][0]) && (p[1] == intdoubleAr[m][1])) ||
                        ((p[1] == intdoubleAr[m][0]) && (p[0] == intdoubleAr[m][1]))) {
                    System.out.println("Выигрыш в Парном в ---- " + m + " заезде ----- ");
                }
                if (((exp4[0] == intdoubleAr[m][0]) && (exp4[1] == intdoubleAr[m][1])) &&
                        ((exp4[2] == intdoubleAr[m][2]) && (exp4[3] == intdoubleAr[m][3]))) {
                    System.out.println("Выигрыш в Экспрессе4 в ---- " + m + " заезде ----- ");
                }
                if (((ez[0] == intdoubleAr[m][0]) || (ez[0] == intdoubleAr[m][1]) || (ez[0] == intdoubleAr[m][2])) &&
                        ((ez[1] == intdoubleAr[m][0]) || (ez[1] == intdoubleAr[m][1]) || (ez[1] == intdoubleAr[m][2]))) {
                    System.out.println("Выигрыш в Экзакте в ---- " + m + " заезде ----- ");
                }
            }
        }
    }
}