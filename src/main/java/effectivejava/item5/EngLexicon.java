package effectivejava.item5;

import java.util.Arrays;
import java.util.List;

public class EngLexicon extends Lexicon{
    private List<String> words = Arrays.asList("A","B","C","D");

    @Override
    public List<String> getWords() {
        return words;
    }
}
