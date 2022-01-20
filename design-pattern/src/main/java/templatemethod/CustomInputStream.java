package templatemethod;

import java.io.IOException;
import java.io.InputStream;

public class CustomInputStream extends InputStream {
    @Override
    public int read() throws IOException {
        return 0;
    }
}
