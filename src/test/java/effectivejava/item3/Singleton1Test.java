package effectivejava.item3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class Singleton1Test {

    @Test
    @DisplayName("인스턴스가 전체 시스템에서 하나뿐임이 보장된다.")
    public void singleton() {
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;

        Assertions.assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("리플렉션을 사용하면 private 생성자를 호출할 수 있다.")
    public void reflection() throws Exception {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        Singleton1 singleton1Reflection;

        Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        singleton1Reflection = constructor.newInstance();

        Assertions.assertNotSame(singleton1, singleton1Reflection);
    }
}
