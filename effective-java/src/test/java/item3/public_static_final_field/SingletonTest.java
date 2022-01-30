package item3.public_static_final_field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("public static final 필드 방식 : 인스턴스가 전체 시스템에서 하나뿐임이 보장된다.")
    public void singleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    @DisplayName("리플렉션을 사용하면 private 생성자를 호출할 수 있다.")
    public void reflection() throws Exception {
        Singleton singleton = Singleton.getInstance();
        Singleton singletonReflection;

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        singletonReflection = constructor.newInstance();

        assertThat(singleton).isNotSameAs(singletonReflection);
    }
}
