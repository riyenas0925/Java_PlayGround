package adapter.inheritance;

/*
    상속을 사용한 Adapter 패턴
    Main(Client) : Target 역할의 메서드를 사용해서 일을 함
    Banner(Adapt-ee) : 이미 제공되어 있는 것
    PrintBanner(Adapt-er) : 사이의 차이
    Print(Target) : 필요한 것

    Main(Client)
    Banner(Adapt-ee) -> PrintBanner(Adapt-er) -> Print(Target)
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        /*
            아래와 같이 하지 않는 이유
        */
        PrintBanner pb = new PrintBanner("Hello");
        pb.printWeak();
        pb.printStrong();
    }
}
