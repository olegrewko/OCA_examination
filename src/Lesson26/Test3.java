package Lesson26;

public class Test3 {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(char i) {
        System.out.println("char");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
        t.abc('-');
    }
}
