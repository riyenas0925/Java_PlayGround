package item3.enum_type;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
    @Test
    @DisplayName("열거 타입 방식 : 인스턴스가 전체 시스템에서 하나뿐임이 보장된다.")
    public void singleton() {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        assertThat(instance1).isSameAs(instance2);
    }
}
