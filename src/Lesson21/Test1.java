package Lesson21;

public class Test1 {
    public static void main(String[] args) {
        char array[] = {'p', 'r', 'i', 'v', 'e', 't'};
//        String s = new String(array);
//        System.out.println(s);
        StringBuilder sb = new StringBuilder("Hello world");
//        sb.append(array, 2, 3 );
        sb.insert(2, array, 1, 3);
        System.out.println(sb);
    }
}
