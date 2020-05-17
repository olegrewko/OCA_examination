package comC;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteOb002 {
    public static void main (String[] args) throws IOException {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};
        FileOutputStream fos = new FileOutputStream("index01.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(people);
        fos.close();
    }
}
