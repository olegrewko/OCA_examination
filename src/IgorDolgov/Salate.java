package IgorDolgov;

import java.util.ArrayList;

public  class Salate {
    public static void main(String[] args) {
       int ves = 70;
       int rost = 172;
       int a = bmi(70, 172);
        System.out.println(a);
        ArrayList m = newMenu();
        System.out.println(m);
    }

    private static int bmi(int ves, int rost) {
      int index = ves * rost / 100;
      return index;
    }
    public static ArrayList newMenu() {
        ArrayList menu = new ArrayList();
        menu.add("Добавить новую книгу");
        menu.add("Просмотр информации по книге");
        menu.add("Удалить книгу");
        menu.add("Поиcк книги");
        menu.add("Выход");
        return menu;
    }

}
