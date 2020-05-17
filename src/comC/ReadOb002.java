package comC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadOb002 {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("index01.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person[] people = (Person[]) ois.readObject();
        System.out.println(Arrays.toString(people));
        ois.close();
    }
}
