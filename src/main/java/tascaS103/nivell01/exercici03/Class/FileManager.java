package tascaS103.nivell01.exercici03.Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileManager {

    private String fileText;
    HashMap<String, String> cityCapitals;

    public FileManager(){
        this.fileText = "";
        this.cityCapitals = new HashMap<String, String>();
    }

    public String getFile(){
      return this.fileText;
    }

    public void cityCapitalsInit(String fileName){
        readFile(fileName);
        splitFile();
    }

    private void readFile(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String textLine;

            while((textLine = reader.readLine()) != null){
                this.fileText += textLine +";";
            }
            } catch(FileNotFoundException e){
            System.out.print(Message.E_FILE_NOT_FOUND);
        }catch(IOException e){
            System.out.print(Message.E_FAILED_READING);
        }
    }
    // Make CSV file with city/capital pairs
    private void splitFile(){

        String[] lines = this.fileText.split(";");

        for(int i = 0; i < lines.length; i++){
            String[] parts = lines[i].split(" ");
            this.cityCapitals.put(parts[0], parts[1]);
        }
    }

    public void printCSVFile(){
        System.out.println(this.fileText);
        System.out.println();
    }

    public void printCityCapital(){
        System.out.println(this.cityCapitals);
        System.out.println();
    }
}
