package item5;

import java.util.Arrays;
import java.util.List;

public class KorLexicon extends Lexicon{
    private List<String> words = Arrays.asList("가","나","다","라");

    @Override
    public List<String> getWords() {
        return words;
    }
}
