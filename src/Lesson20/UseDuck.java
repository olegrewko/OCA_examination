package Lesson20;

public class UseDuck {
    public static void main(String[] args) {
        Duck d = new Duck(50);
        Duck d2 = new Duck();
        System.out.println(d.size + d2.size);
        int i = 5;
        if (i++ <= 5) {
            System.out.println(i);
        }

        if (++i <= 7) {
            System.out.println(i);
        }
//        int[][] array = {{1,2}, {3,4}};
//        int k = 5;
//        try {
//            array[abc()][k = 0]++;
//        }catch(Exeption e) {
//            System.out.println(k + " " + array[1][1]);
//        }
//
//    }
//    static int abc() throws Exeption {
//        throw new Exception();
//    }
    }
}
class Duck {
    int size;
    public Duck(int duckSize) {
        System.out.println("Кря");
        size = duckSize;
        System.out.println("Размер равен" + size);
    }
    public Duck() {

        size = 27;
        System.out.println("Размер равен" + size);
    }
}
