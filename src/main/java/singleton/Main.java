package singleton;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public Main() throws IOException {
    }
    LazySingleton lazySingleton = LazySingleton.getInstance();
    FileOutputStream fos = new FileOutputStream("EmployeeObject.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    // write object to file
    oos.writeObject(lazySingleton);
}
