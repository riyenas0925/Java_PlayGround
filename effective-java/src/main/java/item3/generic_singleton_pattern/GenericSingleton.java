package item3.generic_singleton_pattern;

import java.util.HashSet;
import java.util.Set;

public class GenericSingleton {
    public static final Set EMPTY_SET = new HashSet();

    @SuppressWarnings("unchecked")
    public static final <T> Set<T> emptySet() {
        return (Set<T>) EMPTY_SET;
    }
}
