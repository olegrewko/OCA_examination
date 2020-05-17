package IgorDolgov;

import java.util.Arrays;

public class Test5Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0]=3;
        numbers[5]=200;
        System.out.println(Arrays.toString(numbers));
        int[] numbers2 = numbers;
        numbers2[1] = 111;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
//        numbers2 = null;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers));
        //itar + tab
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        int[] ints = {1, 2, 3};
        int[] clone = ints.clone();
//        clone[0] = 42;
        System.out.println(Arrays.toString(ints)); // [1, 2, 3]
        System.out.println(Arrays.toString(clone)); // [42, 2, 3]
        // массив, в котором хотим найти элемент
        int[] ints02 = {9, 3, 2};
// делаем копию, чтобы при сортировке отсортировать копию, не изменив оригинальный массив
        int[] clone02 = ints02.clone();
// сортируем копию массива
        Arrays.sort(clone02);
// выведем на экран, чтобы убедиться, что копия массива отсортирована,
// а оригинальный массив остался без изменений
        System.out.println(Arrays.toString(ints02)); // [9, 3, 2]
        System.out.println(Arrays.toString(clone02)); // [2, 3, 9]
// теперь ищем в копии число 9
        int i = Arrays.binarySearch(clone02, 9);
// находим, выводим на экран индекс найденного элемента
        System.out.println(i); // 2
// зачем нам сортировать?
// Метод Arrays.binarySearch() работает только с отсортированным массивом
    }
}
