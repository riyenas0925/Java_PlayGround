package templatemethod;

public class CharDisplay extends AbstractDisplay {

    private final char ch;

    public CharDisplay(char character) {
        this.ch = character;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
