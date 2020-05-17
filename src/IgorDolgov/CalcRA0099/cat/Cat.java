package IgorDolgov.CalcRA0099.cat;
public class Cat {

    Plate plate = new Plate();
    Bowl bowl = new Bowl();
    String name;// this.name
    static int count;
    int NumberCat;
    public Cat (String name) {
        this();
        this.name = name;
    }
    public Cat () {
        count++;
        NumberCat = count;
    }
}
