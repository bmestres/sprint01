package tascaS103.nivell02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    public ArrayList<String> getFileLines(String fileName) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String textLine;
            while ((textLine = reader.readLine()) != null) {
                lines.add(textLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(Message.E_FILE_NOT_FOUND);
        } catch (IOException e) {
            System.out.println(Message.E_FAILED_READING);
        }
        return lines;
    }
}


