package playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualAndSame {

    @Test
    public void equal() {
        String s1 = new String("test");
        String s2 = new String("test");

        assertThat(s1).isEqualTo(s2);
        assertThat(s1).isNotSameAs(s2);
    }

    @Test
    public void same() {
        String s1 = "test";
        String s2 = "test";

        assertThat(s1).isEqualTo(s2);
        assertThat(s1).isSameAs(s2);
    }
}
