package comAV;

public class Dog {
    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNEFIND;

    public  Dog(){
        dogsCount++;
        System.out.println("Кол-во собак: " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
//        if( size.equalsIgnoreCase("Big") ||
//                size.equalsIgnoreCase("Average") ||
//                        size.equalsIgnoreCase("Small") ) {
//        this.size = size;
//    } else {
//        System.out.println("Big, Average, Small");
//    }
}



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    protected int getPaws() {
        return PAWS;
    }

    public int getTail() {
        return TAIL;
    }

//    public void setTail(int tail) {
//        this.TAIL = tail;
//    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

//    public void setPaws(int paws) {
//        if (paws == 4) {
//            this.PAWS = 4;
//        } else {
//            System.out.println("Правильное число 4");
//        }
//    }
public void bark() {

    switch (size) {
        case BIG:
        case VERY_BIG:
            System.out.println("Wof");
            break;
        case AVERAGE:
            System.out.println("Raf");
            break;
        case SMALL:
        case VERY_SMALL:
            System.out.println("Tiav");
            break;
        default:
            System.out.println("Размер собаки не определен");
    }
}
//        if("Big".equalsIgnoreCase(String.valueOf(size))) {
//            System.out.println("Wow");
//        } else if ("Average".equalsIgnoreCase(String.valueOf(size))) {
//            System.out.println("Raf");
//        } else {
//            System.out.println("Tiav");
//        }
//
//    }
    public void bite() {
        if(dogsCount > 2){
            System.out.println("Собаки кусаются");
        } else {
            bark();
        }

    }
}
