package realworldjava;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFromCSV(final List<String> lines);
}
