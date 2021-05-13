package effectivejava.item5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpellCheckerTest {

    @Test
    public void test() {
        // 영어사전에서 검색하고 싶으면 영어사전을 주입한다.
        EngLexicon engDictionary = new EngLexicon();
        SpellChecker engSpellChecker = new SpellChecker(engDictionary);
        Assertions.assertEquals(true, engSpellChecker.isValid("A"));

        // 국어사전에서 검색하고 싶으면 국어사전을 주입한다.
        KorLexicon korDictionary = new KorLexicon();
        SpellChecker korSpellChecker = new SpellChecker(korDictionary);
        Assertions.assertEquals(true, korSpellChecker.isValid("가"));

        //
        Lexicon nullDictionary = new Lexicon();
        SpellChecker nullSpellChecker = new SpellChecker(nullDictionary);
        Assertions.assertThrows(NullPointerException.class, () ->
                nullSpellChecker.isValid("가")
        );
    }
}
