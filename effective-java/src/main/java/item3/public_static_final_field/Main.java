package item3.public_static_final_field;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Singleton> supplier = Singleton::getInstance;
        Supplier<Singleton> supplier1 = () -> Singleton.getInstance();

        System.out.println(supplier.get().getClass().getSimpleName());
    }
}
