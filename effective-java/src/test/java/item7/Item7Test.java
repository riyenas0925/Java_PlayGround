package item7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class Item7Test {
    public static void main(String[] args) {
        StackOld stack = new StackOld();
        for(int i = 0; i < 200_000_000_0; i++) {
            String str = "Test Sequence : " + i;
            stack.push(str);
            System.out.println(stack.pop());
        }
    }

    @Test
    @DisplayName("weadkHashMap은 일반적인 방법으로 key를 통해 value에 접근하지 못한다면 key, value를 삭제한다.")
    public void weakHashMap() throws InterruptedException {
        //given
        WeakHashMap<Object, String> map = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        map.put(key1, "Test 1");
        map.put(key2, "Test 2");

        //when
        key1 = null;

        System.gc();    //gc가 바로 실행된다는 보장은 없음
        Thread.sleep(100);

        //that
        map.entrySet().stream().forEach(el -> System.out.println(el));

        assertThat(map.size()).isEqualTo(1); // key1에 해당하는 key/value pair은 제거된다(GC).
    }

    @Test
    @DisplayName("hashMap은 일반적인 방법으로 key를 통해 value에 접근하지 못해도 key, value가 삭제되지 않는다.")
    public void hashMap() throws InterruptedException {
        //given
        HashMap<Object, String> map = new HashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        map.put(key1, "Test 1");
        map.put(key2, "Test 2");

        //when
        key1 = null;

        System.gc();    //gc가 바로 실행된다는 보장은 없음
        Thread.sleep(100);

        //that
        map.entrySet().stream().forEach(v -> System.out.println(v));

        assertThat(map.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("removeEldestEntry()는 정해진 사이즈 이상의 엔트리가 오면 제일 오래된 엔트리를 삭제하고 새로운 엔트리를 추가한다.")
    public void linkedHashMap_removeEldestEntry() {
        //given
        final int MAX_ENTRIES = 4;

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > MAX_ENTRIES;
            }
        };

        linkedHashMap.put(0, "Test 0");
        linkedHashMap.put(1, "Test 1");
        linkedHashMap.put(2, "Test 2");
        linkedHashMap.put(3, "Test 3");

        //when
        linkedHashMap.put(4, "Test 4"); // MAX_ENTRIES 개수 이상이 들어온다면

        //that
        assertThat(linkedHashMap.containsKey(0)).isFalse(); // 가장 오래된 엔트리는 삭제된다.
        assertThat(linkedHashMap.containsKey(1)).isTrue();
        assertThat(linkedHashMap.containsKey(2)).isTrue();
        assertThat(linkedHashMap.containsKey(3)).isTrue();
        assertThat(linkedHashMap.containsKey(4)).isTrue();  // 가장 최근에 추가된 엔트리
    }
}
