package comC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile  {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("index08");
        PrintWriter pw = new PrintWriter(file);
        pw.println("test001");
        pw.println("test002");
        pw.close();
    }
}
