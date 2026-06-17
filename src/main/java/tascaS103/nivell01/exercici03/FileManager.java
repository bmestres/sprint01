package tascaS103.nivell01.exercici03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    private String fileText;

    public FileManager(){
        this.fileText = "";
    }

    public void readFile(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String textLine;

            while((textLine = reader.readLine()) != null){
                this.fileText += textLine +"\n";
            }

            } catch(FileNotFoundException e){
            System.out.print(Message.E_FILE_NOT_FOUND);
        }catch(IOException e){
            System.out.print(Message.E_FAILED_READING);
        }
    }

    public void printFile(){
        System.out.println(this.fileText);
    }
}
