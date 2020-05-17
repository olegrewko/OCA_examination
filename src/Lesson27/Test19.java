package Lesson27;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        }catch (IOException e )  {
            System.out.println("Exception poiman");
        }
    }

}
///////////////////////////////////////////
class Animal003 {
    Animal003 () throws FileNotFoundException {}
}
class Mouse003 extends Animal003 {
    Mouse003 () throws FileNotFoundException {super();}
}
//////////////////////////////////
class Animal2 {
    void run() throws IOException {
        System.out.println("Animal run");
    }
    void run(int k) throws Exception {
        System.out.println("Animal run");
    }
}
class Mouse extends Animal2 {
    void run() throws ArrayIndexOutOfBoundsException  {
        System.out.println("Mouse run");
    }
}