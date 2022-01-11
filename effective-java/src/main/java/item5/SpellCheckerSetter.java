package item5;

public class SpellCheckerSetter {
    private static Lexicon dictionary;

    private SpellCheckerSetter() {}

    public static boolean isValid(String word) {
        return dictionary.getWords().stream()
                .anyMatch(w -> w.equals(word));
    }

    public static void setLexicon(Lexicon lexicon) {
        dictionary = lexicon;
    }
}
