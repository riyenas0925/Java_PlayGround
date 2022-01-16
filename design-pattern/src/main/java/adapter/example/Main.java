package adapter.example;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static final String RESOURCES_PATH = "design-pattern/src/main/resources/";

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile(RESOURCES_PATH + "file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(RESOURCES_PATH + "newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            f.readFromFile(RESOURCES_PATH + "newfile.txt");
            System.out.println("year=" + f.getValue("year"));
            System.out.println("month=" + f.getValue("month"));
            System.out.println("day=" + f.getValue("day"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
