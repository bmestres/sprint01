package tascaS103.nivell01.exercici03.Class;


public class Main {

    public static void main(String[] args) {
        gameInit();
    }

    public static void gameInit(){
        FileManager manager = new FileManager();
        manager.cityCapitalsInit("countries.txt");
        GameControl game = new GameControl(manager.getCityCapitals());
        ConsoleUI consoleUI = new ConsoleUI(game);
        String outcome = consoleUI.start();
        manager.saveGame(outcome, "scores.txt");
    }
}
