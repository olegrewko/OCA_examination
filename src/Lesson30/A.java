package Lesson30;

public class A {
    String str1;
    public A(){str1 = abc("String1");}//конструктор
    static String str = abc("String2");
    String str3 = abc("String3");
    { str1 = abc("String4"); }
    static { String str1 = abc("String5"); }
    static String str2 = abc("String6");
    String str4 = abc("String7");
    public static void main(String[] args) {
        A a = new A();
    }
    static String abc(String str) {
        System.out.println(str);
        return str;
    }
}
