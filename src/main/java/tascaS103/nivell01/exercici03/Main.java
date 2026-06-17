package tascaS103.nivell01.exercici03;


public class Main {

    public static void main(String[] args) {

        FileManager manager = new FileManager();

        manager.readFile("countries.txt");

        manager.printFile();
    }
}
