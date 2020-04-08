package FinalProject;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;

    //constructor
    public ReadFile(String fileName) {
        path = fileName;
    }

    //method to open and read the file
    public String[] OpenFile() throws IOException {
        //create object of FileReader class and pass through BufferedReader class
        //which will read the file line by line instead of character by character
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        //Read the file
        int numberOfLines = readLines();
        String[] characterData = new String[numberOfLines];

        int i;
        for (i=0; i < numberOfLines; i++) {
            characterData[i] = textReader.readLine();
        }
        textReader.close();
        return characterData;
    }

    //This method will determine the number of lines in the file
    int readLines() throws IOException {
        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);

        String aLine;
        int numberOfLines = 0;
        while (( aLine = bf.readLine()) != null) {
            numberOfLines++;
        }
        bf.close();

        return numberOfLines;
    }
}
