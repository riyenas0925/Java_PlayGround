package item3.singleton_serializable;

import java.io.Serializable;

public class SingletonWithSerializable implements Serializable {
    private static final transient SingletonWithSerializable INSTANCE = new SingletonWithSerializable();

    private SingletonWithSerializable() {

    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static SingletonWithSerializable getInstance() {
        return INSTANCE;
    }
}
