package templatemethod;

import java.nio.charset.StandardCharsets;

public class StringDisplay extends AbstractDisplay{

    private final String string;
    private final int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.printf("+");
        for(int i = 0; i < width; i++) {
            System.out.printf("-");
        }
        System.out.println("+");
    }
}
