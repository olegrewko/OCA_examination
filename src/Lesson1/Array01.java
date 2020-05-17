package Lesson1;

import java.util.Random;

public class Array01 {
    public static void main(String[] args) {
        String [] myList = new String[2];
        int SIZE = myList.length;
        String a = new String("Hura");
        myList[0] = a;
        String b = new String("Frog");
        myList[1] = b;
        String o = myList[1];
        myList[1] = null;
        boolean isIn = false;
        for (String item:myList
             ) {if (b.equals(item)) {
                 isIn = true;
                 break;
        }

        }
        System.out.println(isIn);
        System.out.println("Frog".length());
        Random generator = new Random();
        System.out.println (generator .nextInt ()) ;
        System.out.println(generator.nextInt());
        StringBuilder builder = new StringBuilder();

    }
}
