package Lesson20;

public class TestExeption {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("Begin try");
            doRisky(test);
            System.out.println("End try");
        } catch (ScaryExeption se) {
            System.out.println("Жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End main");
    }
    static void doRisky(String test) throws ScaryExeption {
        System.out.println("Начало опасного метода");
        if ("yes".equals(test)) {
            throw new ScaryExeption();
        }
        System.out.println("Конец опасного метода");
        return;
    }
}
