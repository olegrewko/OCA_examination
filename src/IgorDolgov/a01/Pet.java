package IgorDolgov.a01;

public abstract class Pet extends Animal {

    @Override
    void feed() {
        super.feed();
        System.out.println("вкушает еду");
    }
}
