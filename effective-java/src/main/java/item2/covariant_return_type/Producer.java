package item2.covariant_return_type;

import java.util.Locale;

public class Producer {
    public Object produce(String input) {
        Object result = input.toLowerCase(Locale.ROOT);
        return result;
    }
}


