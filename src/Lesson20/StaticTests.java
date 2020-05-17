package Lesson20;



class StaticSuper {
    static {
    System.out.println("Родительский статический блок 001");
}
StaticSuper(){
        System.out.println("Родительский конструктор");
    }
}
public class StaticTests extends StaticSuper {
    static int rand;
    static {
        rand = (int) (Math.random() * 10);
        System.out.println("Статический блок 002  " + rand);
    }
    StaticTests()
    {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Внутри main");
        StaticTests st = new StaticTests();
    }
}
