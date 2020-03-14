package Homework.Lesson18;

public class Test7 {
    public static void main(String[] args) {
//        Еще один конструктор класса String
        char [] array = {'p','r','i','v','e','t'};
        String s = new String(array);
        System.out.println(s);

//        Метод append
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array, 2, 3);

        System.out.println(sb);
//        Метод insert
        StringBuilder sb1 = new StringBuilder("privet");
        sb1.insert(1, array, 2, 3);
        sb.insert(1, array, 2, 3);
        System.out.println(sb1);
        System.out.println(sb);

    }
}
