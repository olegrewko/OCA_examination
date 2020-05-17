package IgorDolgov.a01;

public abstract class Animal {
    String name;
    int age;

    void sleep() {
        System.out.println("i am sleeping");
    }

    void feed() {
        System.out.println("animal eat something");
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}
