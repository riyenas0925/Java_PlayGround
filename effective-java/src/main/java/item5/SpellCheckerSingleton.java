package item5;

public class SpellCheckerSingleton {
    private final Lexicon dictionary = new KorLexicon();

    private SpellCheckerSingleton() {}

    private static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

    public boolean isValid(String word) {
        return dictionary.getWords().stream()
                .anyMatch(w -> w.equals(word));
    }
}
