package FinalProject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    private String path;
    private boolean appendToFile = false;

    //Constructor that will overwrite the file
    public WriteFile(String filePath) {
        path = filePath;
    }

    //Constructor that will append info to the file
    public WriteFile(String filePath, boolean appendValue) {
        path = filePath;
        appendToFile = appendValue;
    }

    //Write the info to the file
    public void writeToFile(String textLine) throws IOException {
        FileWriter write = new FileWriter(path, appendToFile);
        PrintWriter printLine = new PrintWriter(write);
        printLine.printf("%s" + "%n", textLine);
        printLine.close();
    }
}
