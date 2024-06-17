package singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            LazySingleton lazySingleton = LazySingleton.getInstance();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
            objectOutputStream.writeObject(lazySingleton);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
            LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Object 1 :" + lazySingleton.hashCode());
            System.out.println("Object 2 :" + deserializedLazy.hashCode());

            SerializableSingleton serializableSingleton=SerializableSingleton.getInstance();
            ObjectOutputStream objectOutputStream1=new ObjectOutputStream(new FileOutputStream("object1.obj"));
            objectOutputStream1.writeObject(serializableSingleton);
            objectOutputStream1.close();
            ObjectInputStream objectInputStream1=new ObjectInputStream(new FileInputStream("object1.obj"));
            SerializableSingleton deserializedInstance=(SerializableSingleton) objectInputStream1.readObject();
            objectInputStream1.close();
            System.out.println("Object 1 : "+serializableSingleton.hashCode());
            System.out.println("Object 2 : "+deserializedInstance.hashCode());

    }
}
