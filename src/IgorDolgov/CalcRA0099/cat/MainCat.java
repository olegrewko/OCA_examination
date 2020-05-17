package IgorDolgov.CalcRA0099.cat;


public class MainCat {
    public static void main (String[] args) {
        Cat cat01 = new Cat("Vasia");
        Cat cat02 = new Cat("Petr");
        Cat cat03 = new Cat("Oleg");
        Cat cat04 = new Cat("Katya");
        System.out.println("Создано кошек" + Cat.count);
        System.out.println(cat01.name + " # " + cat01.NumberCat);
        System.out.println(cat02.name + " # " + cat02.NumberCat);
        System.out.println(cat03.name + " # " + cat03.NumberCat);
        System.out.println(cat04.name + " # " + cat04.NumberCat);
        System.out.println(cat01.name + " Номер Васи сохраняется # " + cat01.NumberCat);
        cat01.bowl.drink();
        System.out.println(cat01.name + " Осталось воды " + cat01.bowl.voda);
        cat02.plate.eat();
        cat02.plate.eat();
        cat03.bowl.drink();
        cat04.plate.eat();
        System.out.println(cat01.name + " Осталось воды " + cat01.bowl.voda);
        System.out.println(cat02.name + " Осталось еды " + cat02.plate.eda);
        System.out.println(cat03.name + " Осталось воды " + cat03.bowl.voda);
        System.out.println(cat04.name + " Осталось еды " + cat04.bowl.voda);
    }
}
