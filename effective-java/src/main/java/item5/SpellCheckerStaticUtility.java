package item5;

public class SpellCheckerStaticUtility {
    private static final Lexicon dictionary = new KorLexicon();

    private SpellCheckerStaticUtility() {}

    public static boolean isValid(String word) {
        return dictionary.getWords().stream()
                .anyMatch(w -> w.equals(word));
    }
}
