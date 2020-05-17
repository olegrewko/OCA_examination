package Lesson23;


import Lesson20.ScaryExeption;

public class TestException {
    public static void main(String[] args) {
        String test = "No";
        try {
            System.out.println("Begin try");
            doRisky(test);
            System.out.println("End try");
        } catch (ScaryExeption se) {
            System.out.println("Very Bad Exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End main");
    }

    static void doRisky(String test) throws ScaryExeption {
        System.out.println("Начало опасного метода");
        if ("Yes".equals(test)) {
            throw new ScaryExeption();
        }
        System.out.println("Конец опасного метода");
        return;
    }
}




