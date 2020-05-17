package IgorDolgov.CalcRA0099.cat02;

public class CatMain {
    public static void main(String[] args) {
        Plate plate = new Plate(); // Общая на всех тарелка
        Cat cat = new Cat(); // Кошка
        cat.eatFrom(plate); // кошка кушает из тарелки, которую передали ей в параметрах
        plate.feed(cat); // тарелка "кормит" кошку, которую ей передали в параметры
    }
}
class Cat {
    public int portion = 10; // размер порции
    int consumed; // храним кол-во съеденной пищи
    void eatFrom(Plate plate) {
        // int portion = получите из тарелки порцию еды (так чтобы и в тарелке еда тоже уменьшилась)
        // увеличьте consumed на размер этой порции
        System.out.println("Кошка съела из тарелки " + portion);
        System.out.println("Кошка всего съела " + consumed);
    }
}
class Plate  {
   public int amount = 100; // сколько еды в тарелке осталось
   public int portion = 10; // размер порции
    void feed(Cat cat) {
        // уменьшите размер amount на размер порции (сделайте проверку, чтобы было нельзя съесть больше, чем в тарелке осталось)
        // увеличьте у кошки кол-во потребленной ей еды на размер этой порции
        System.out.println("Тарелка покормила кошку на " + portion);
        System.out.println("В тарелке осталось " + amount);
        System.out.println("Кошка всего съела " + cat.consumed);
    }
    void getPortion()  {
        // уменьшите размер оставшейся в тарелке еды на размер порции
        // (сделайте проверку, чтобы было нельзя съесть больше, чем в тарелке осталось)
        // (если еды мало – то всю ее и съесть)
        System.out.println("В тарелке осталось " + amount);
        // верните потребленный размер порции с помощью return
        return;
    }
}