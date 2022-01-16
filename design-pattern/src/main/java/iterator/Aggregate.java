package iterator;

/* Aggregate 인터페이스
    요소들이 나열되어 있는 집합체를 나타냄
    이 인터페이스를 구현하고 있는 클래스는 배열과 같이 무엇인가가 많이 모여 있습니다.
    Aggregate는 모으다, 모이다, 집합이라는 의미
 */
public interface Aggregate {
    /*
        Aggregate 인터페이스에서 선언되어 있는 메서드는 iterator 메서드 하나뿐
        이 메서드는 집합체(Aggregate)에 대응하는 iterator 를 1개 작성하기 위한 것

        집합체를 하나씩 나열하고, 검색하고, 조사하고 싶을 때에는 iterator 메서드를 사용해
        iterator 인터페이스를 구현한 클래스의 인스턴스를 1개 만듭니다.
     */
    public abstract Iterator iterator();
}
