package effectivejava.item6;

import java.util.regex.Pattern;

public class Item6 {
    public static void main(String[] args) {
        String s1 = new String("bikini");
        String s2 = "bikini";

        Boolean bool1 = new Boolean("true");
        Boolean bool2 = Boolean.valueOf("true");
    }

    static boolean isRomanNumeralOld(String s) {
        return s.matches(
                "^(?=.)M*(C[MD]|D?C{0,3})"
                        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
        );
    }

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );

    static boolean isRomanNumeralNew(String s) {
        return ROMAN.matcher(s).matches();
    }

    static long sumOld() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    static long sumNew() {
        long sum = 0;

        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
}
