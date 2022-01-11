import calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator cal;

    @BeforeEach
    public void setup() {
        cal = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertThat(7).isEqualTo(cal.add(3, 4));
    }

    @Test
    public void 뺄셈() {
        assertThat(7).isEqualTo(cal.subtract(10, 3));
    }

    @Test
    public void 곱셈() {
        assertThat(12).isEqualTo(cal.multiply(3, 4));
    }

    @Test
    public void 나눗셈() {
        assertThat(4).isEqualTo(cal.divide(12, 3));
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }
}
