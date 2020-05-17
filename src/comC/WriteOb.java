package comC;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteOb {
    public static void main (String[] args) {

        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"),new Person(3, "Tom")};
        try {
            FileOutputStream fos = new FileOutputStream("index01.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(people.length);
            for (Person person : people) {
            oos.writeObject(person);
            }
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
