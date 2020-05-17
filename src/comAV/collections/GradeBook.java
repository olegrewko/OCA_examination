package comAV.collections;

import java.util.Arrays;

public class GradeBook {

    public static void main (String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};


        displayArrays();
        int intMin = calcimine(gradesArray);
        System.out.println("Минимальное значение двумерного массива" + intMin);
        processArrays();
    }

    private static void processArrays () {
        double[] doubleArray = {1.2, 3.6, 8.6, 0.5, 7.5, 0, 0.2, 0.6};
        Arrays.sort(doubleArray);
        System.out.println("sorted doubleArray" + Arrays.toString(doubleArray));
    }

    private static void processGrades (int[][] gradesArray) {
        double average = calcAverage(gradesArray);
        int min = calcMin(gradesArray);
        int max = calcMax(gradesArray);

        System.out.println("Class average is " + average);
        System.out.println("Class min is " + min);
        System.out.println("Class max is " + max);
    }

    private static int calcimine (int[][] gradesArray) {
        int min = 100;
        for (int row[] : gradesArray) {
            for (int i : row) {
                if (min > i) {
                    min = i;
                }
            }

        }
        return min;
    }

    private static int calcMax (int[][] gradesArray) {
        int max = 0;
        for (int[] row : gradesArray) {
            for (int i : row) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }

    private static int calcMin (int[][] gradesArray) {
        int min = 100;
        for (int[] row : gradesArray) {
            for (int i : row) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;

    }

    private static double calcAverage (int[][] gradesArray) {
        double sum = 0;
        int gradeNumber = 0;
        for (int[] row : gradesArray) {
            gradeNumber = gradeNumber + row.length;
            for (int i : row) {
                sum = sum + i;
            }
        }
        return sum / gradeNumber;
    }


    private static void varArgs () {
        double a = 2.3;
        double b = 4.5;
        double c = 6.8;
        double d = 2.9;

        System.out.println("Average 1 " + calculateAverage(a, b));
        System.out.println("Average 2 " + calculateAverage(a, b, c));
        System.out.println("Average 3 " + calculateAverage(a, b, c, d));
    }

    private static double calculateAverage (double... args) {
        double sum = 0;
        for (double i : args) {
            sum = sum + i;
        }
        return sum / args.length;
    }

    private static void displayArrays () {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4, 0.1, 0.0};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("--------------");
        double[] doubleArray002 = Arrays.copyOf(doubleArray, doubleArray.length);
        System.out.println(Arrays.toString(doubleArray002));
        System.out.println("--------------");
        double[] clone02 = doubleArray.clone();
        System.out.println(Arrays.toString(clone02));
        System.out.println("----------------------------------------------");

        int[] filledArray = new int[7];
        Arrays.fill(filledArray, 7);
        char[] charbroiledArray = new char[7];
        Arrays.fill(charbroiledArray, '*');
        System.out.println(Arrays.toString(filledArray));
        System.out.println(Arrays.toString(charbroiledArray));
        System.out.println(charbroiledArray);

        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] cloneArray = intArray.clone();
        int[] arrayCopy = new int[19];
        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        System.out.println(Arrays.toString(arrayCopy));
        System.out.println(Arrays.toString(cloneArray));
        varArgs();
        processArrays();
    }
}
