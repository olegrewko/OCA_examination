package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger4();
        System.out.println(an.a);
        System.out.println(an.b);

        an.abc();
        an.def();

    }
}

class Animal {
    int a = 5;
    static int b = 1;

    void abc() {
        System.out.println("non static metod iz klassa animal");
    }

    static void def() {
        System.out.println("static metod iz klacca Animal");
    }
}
    class Tiger4 extends Animal {
        int a = 15;
        static int b = 20;
        void abc() {
            System.out.println("non-static metod iz classa tiger");
        }
        static void def() {
            System.out.println("static metod iz klassa tiger");
        }
    }

