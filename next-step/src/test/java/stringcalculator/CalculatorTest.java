package stringcalculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    Calculator cal;

    @BeforeEach
    void setup() {
        cal = new Calculator("5");
    }

    @ParameterizedTest
    @CsvSource(value = {"5:10", "9:14", "0:5"}, delimiter = ':')
    void string_sum(int operand, int expected) {
        cal.add(operand);
        assertThat(expected).isEqualTo(cal.getResult());
    }

    @ParameterizedTest
    @CsvSource(value = {"5:0", "9:-4", "0:5"}, delimiter = ':')
    void string_subtract(int operand, int expected) {
        cal.subtract(operand);
        assertThat(expected).isEqualTo(cal.getResult());
    }

    @ParameterizedTest
    @CsvSource(value = {"2:10", "5:25", "0:0"}, delimiter = ':')
    void string_multiply(int operand, int expected) {
        cal.multiply(operand);
        assertThat(expected).isEqualTo(cal.getResult());
    }

    @ParameterizedTest
    @CsvSource(value = {"5:1", "2:2"}, delimiter = ':')
    void string_divide(int operand, int expected) {
        cal.divide(operand);
        assertThat(expected).isEqualTo(cal.getResult());
    }

    @Test
    @DisplayName("0으로 나눌 수 없다.")
    void string_divide_exception() {
        assertThatThrownBy(() -> {
            cal.divide(0);
        }
        ).isInstanceOf(ArithmeticException.class)
        .hasMessageContaining("/ by zero");
    }

    @AfterEach
    void teardown() {
        cal = null;
    }
}
