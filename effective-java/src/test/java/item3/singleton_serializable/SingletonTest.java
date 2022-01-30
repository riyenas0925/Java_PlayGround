package item3.singleton_serializable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
    @Test
    @DisplayName("직렬화된 인스턴스를 역직렬화 할 때 인스턴스가 새롭게 생긴다.")
    public void singleton() {
        // given
        Singleton singleton = Singleton.getInstance();

        // when
        byte[] serializedData = serialize(singleton); // 직렬화
        Singleton deserializeSingleton = (Singleton) deserialize(serializedData); // 역직렬화

        // that
        assertThat(singleton).isNotSameAs(deserializeSingleton);
    }

    @Test
    @DisplayName("readResolve를 이용하여 기존의 인스턴스를 반환하게 할 수 있다.")
    public void singleton_transient() {
        // given
        SingletonWithSerializable singleton = SingletonWithSerializable.getInstance();

        // when
        byte[] serializedData = serialize(singleton); // 직렬화
        SingletonWithSerializable deserializeSingleton = (SingletonWithSerializable) deserialize(serializedData); // 역직렬화

        // that
        assertThat(singleton).isSameAs(deserializeSingleton);
    }

    private byte[] serialize(Object instance) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(instance);
        } catch (Exception e) {
            // ... 구현 생략
        }
        return bos.toByteArray();
    }

    private Object deserialize(byte[] serializedData) {
        ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            return ois.readObject();
        } catch (Exception e) {
            // ... 구현 생략
        }
        return null;
    }
}
