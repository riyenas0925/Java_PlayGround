package effectivejava.item6;

import static effectivejava.item6.Item6.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Item6Test {

    @Test
    @DisplayName("문자열 리터럴을 사용하는 모든 코드가 같은 객체를 재사용")
    public void string_2() {
        String s1 = new String("apple");
        String s2 = new String("apple");

        assertThat(s1).isEqualTo(s2);
        assertThat(s1).isNotSameAs(s2);

        String s3 = "apple";
        String s4 = "apple";

        assertThat(s3).isEqualTo(s4);
        assertThat(s3).isSameAs(s4);
    }

    @Test
    @DisplayName("생성자 대신 정적 팩터리 메서드를 사용")
    public void static_factory_method() {
        Boolean bool1 = new Boolean("true");
        Boolean bool2 = new Boolean("true");

        assertThat(bool1).isEqualTo(bool2);
        assertThat(bool1).isNotSameAs(bool2);

        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("true");

        assertThat(bool3).isEqualTo(bool4);
        assertThat(bool4).isSameAs(bool4);
    }

    @Test
    @DisplayName("생성 비용이 아주 비싼 객체")
    public void expensive_object() {
        long start, end;

        start = System.currentTimeMillis();

        for(int i = 0; i < 1000; i++) {
            isRomanNumeralOld("LXXXVIII");
        }

        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "ms");

        start = System.currentTimeMillis();

        for(int i = 0; i < 1000; i++) {
            isRomanNumeralNew("LXXXVIII");
        }
        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "ms");
    }

    @Test
    @DisplayName("오토박싱에 의한 객체 생성")
    public void autoboxing() {
        long start, end;

        start = System.currentTimeMillis();

        sumOld();

        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "s");

        start = System.currentTimeMillis();

        sumNew();

        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "s");
    }
}