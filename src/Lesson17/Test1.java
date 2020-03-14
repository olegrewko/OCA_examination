package Lesson17;

public class Test1 {
    public static void bs(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Goodday");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);
        String s = sb2.substring(5);
        String s2 = sb2.substring(0, 5);

        System.out.println(sb2);
        System.out.println(s2);
        System.out.println(s);
        System.out.println(sb2.charAt(4));
        System.out.println(sb2.indexOf("a"));
        sb2.append( 22);
        System.out.println(sb2);
        sb2.reverse();

        System.out.println(sb2);
    }

}
 class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");

    }

}