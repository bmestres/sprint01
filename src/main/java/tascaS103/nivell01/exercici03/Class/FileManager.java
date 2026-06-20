package tascaS103.nivell01.exercici03.Class;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    private String fileText;
    Map<String, String> map;

    public FileManager(){
        this.fileText = "";
        this.map = new HashMap<String, String>();
    }

    public HashMap<String, String> getCityCapitals(){
        return new HashMap<String, String>(this.map);
    }

    public void cityCapitalsInit(String fileName){
        readFile(fileName);
        splitFile();
    }

    public String saveGame(String outcome, String fileName){
        writeFile(outcome, fileName);
        return String.format("SAVED SUCCESSFULLY");
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
            this.map.put(parts[0], parts[1]);
        }
    }

    public void writeFile(String fileName, String content){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.write(fileName);
                writer.close();

            } catch (IOException e) {
                System.out.println(Message.E_IO_EXCEPTION);
            }
    }
}
