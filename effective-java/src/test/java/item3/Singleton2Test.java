package item3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Singleton2Test {
    @Test
    @DisplayName("인스턴스가 전체 시스템에서 하나뿐임이 보장된다.")
    public void singleton() {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        Assertions.assertSame(instance1, instance2);
    }
}
