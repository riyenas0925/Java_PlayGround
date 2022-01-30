package item3.generic_singleton_pattern;

import item3.enum_type.Singleton;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = GenericSingleton.emptySet();
        Set<Integer> set2 = GenericSingleton.emptySet();
        Set<Singleton> set3 = GenericSingleton.emptySet();

        set.add("ab");
        set2.add(123);
        set3.add(Singleton.INSTANCE);

        String s = set.toString();
        System.out.println("s = " + s);
    }
}
