package item3.static_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
    @Test
    @DisplayName("정적 팩터리 방식 : 인스턴스가 전체 시스템에서 하나뿐임이 보장된다.")
    public void singleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }
}
