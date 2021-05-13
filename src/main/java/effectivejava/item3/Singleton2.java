package effectivejava.item3;

public class Singleton2 {
    public static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
