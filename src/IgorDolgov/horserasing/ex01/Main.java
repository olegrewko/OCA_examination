package IgorDolgov.horserasing.ex01;

class Person {
    String name;// this.name
    static int count;
    Person child;
    int id;

    public Person (String name) {
        this();
        this.name = name;

    }

    public Person () {
        count++;
        id = count;
    }


    static public void showCount () {
        System.out.println("Персон: " + count);
    }

    void born (String name) {
        child = new Person(name);
    }
}

public class Main {

    public static void main (String[] args) {
        Person.showCount();
        System.out.println(Person.count);

        new Person("Vas");

        Person ap = new Person("Vase");
        ap.showCount();
        Person apr = new Person("Vast");
        Person kate = new Person("Kate");
        Person.showCount();
        kate.showCount();
        Person petr = new Person("Petr");
        petr.showCount();

        petr.born("Ivan");
        Person.showCount();
        System.out.println(petr.child.name);

    }
}
