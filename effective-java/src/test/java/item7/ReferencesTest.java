package item7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class ReferencesTest {

    @Test
    @DisplayName("소프트 참조의 경우 메모리가 부족하지 않다면 GC 대상이 되지 않는다.")
    public void softReferences() {
        String ref = new String("Test");

        SoftReference<String> softReference = new SoftReference<>(ref);

        // GC의 실행 대상이 가능
        ref = null;

        // GC 실행, 실행이 보장되진 않는다.
        System.gc();

        // JVM의 메모리가 부족하지 않아 GC 실행 대상이 되지 않은 경우
        // null이 아닌 기존 객체가 반환됨
        assertThat(softReference.get()).isEqualTo("Test");
    }

    @Test
    @DisplayName("약한 참조의 경우 GC 대상이 된다.")
    public void weakReferences() {
        String ref = new String("Test");

        WeakReference<String> weakReference = new WeakReference<>(ref);

        // GC의 실행 대상이 가능
        ref = null;

        // GC 실행, 실행이 보장되진 않는다.
        System.gc();

        // JVM의 메모리가 부족하지 않아 GC 실행 대상이 되지 않은 경우
        // null이 아닌 기존 객체가 반환됨
        assertThat(weakReference.get()).isEqualTo(null);
    }
}
