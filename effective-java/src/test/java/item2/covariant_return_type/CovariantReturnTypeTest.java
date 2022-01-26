package item2.covariant_return_type;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CovariantReturnTypeTest {

    @Test
    @DisplayName("")
    public void whenInputIsArbitrary_thenProducerProduceString() {
        String arbitraryInput = "just a random text";
        Producer producer = new Producer();

        Object objectOutput = producer.produce(arbitraryInput);

        assertThat(arbitraryInput).isEqualTo(objectOutput);
        assertThat(String.class).isEqualTo(objectOutput.getClass());
    }

    @Test
    @DisplayName("")
    public void whenInputIsSupported_thenProducerCreatesInteger() {
        String integerAsString = "42";
        Producer producer = new IntegerProducer();

        Object result = producer.produce(integerAsString);

        assertThat(Integer.class).isEqualTo(result.getClass());
        assertThat(Integer.parseInt(integerAsString)).isEqualTo(result);
    }

    @Test
    @DisplayName("")
    public void whenInputIsSupported_thenIntegerProducerCreatesIntegerWithCasting() {
        String integerAsString = "42";
        IntegerProducer producer = new IntegerProducer();

        Integer result = producer.produce(integerAsString);

        assertThat(Integer.parseInt(integerAsString)).isEqualTo(result);
    }
}