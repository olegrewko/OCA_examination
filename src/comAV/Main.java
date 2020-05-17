package comAV;

public class Main {


    public static void main(String[] args) {
        System.out.println("Кол-во собак: " + Dog.getDogsCount());

        Dog lab = new Dog();
//        lab.setPaws(4);
//        lab.setTail(1);
        lab.setName("Charly");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog shep = new Dog();
//        shep.setPaws(4);
//        shep.setTail(1);
        shep.setName("Mike");
        shep.setBreed("Shep");
//        shep.setSize(Size.BIG);
        shep.bite();

        Dog dob = new Dog();
//        dob.setPaws(4);
//        dob.setTail(1);
        dob.setName("Jack");
        dob.setBreed("Doberman");
        dob.setSize(Size.VERY_BIG);
        dob.bite();
        Size s = Size.SMALL;
        System.out.println(s);
        Size s1 = Size.valueOf("BIG");
        System.out.println(s1);

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

//        System.out.println("Lab name is " + lab.getName());
//        System.out.println("Shep name is " + dob.getName());
    }
}
