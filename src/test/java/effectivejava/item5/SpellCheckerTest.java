package effectivejava.item5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpellCheckerTest {

    @Test
    @DisplayName("다른 사전으로 교체하는 메서드를 추가한 방식")
    public void spellCheckerSetterTest() {
        EngLexicon engDictionary = new EngLexicon();
        SpellCheckerSetter.setLexicon(engDictionary);
        assertThat(true).isEqualTo(SpellCheckerSetter.isValid("A"));

        KorLexicon korDictionary = new KorLexicon();
        SpellCheckerSetter.setLexicon(korDictionary);
        assertThat(true).isEqualTo(SpellCheckerSetter.isValid("가"));
    }

    @Test
    @DisplayName("의존 객체 주입 방식")
    public void spellCheckerTest() {
        // 영어사전에서 검색하고 싶으면 영어사전을 주입한다.
        EngLexicon engDictionary = new EngLexicon();
        SpellChecker engSpellChecker = new SpellChecker(engDictionary);
        assertThat(true).isEqualTo(engSpellChecker.isValid("A"));

        // 국어사전에서 검색하고 싶으면 국어사전을 주입한다.
        KorLexicon korDictionary = new KorLexicon();
        SpellChecker korSpellChecker = new SpellChecker(korDictionary);
        assertThat(true).isEqualTo(korSpellChecker.isValid("가"));
    }
}
