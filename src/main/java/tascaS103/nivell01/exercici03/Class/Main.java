package tascaS103.nivell01.exercici03.Class;


public class Main {

    public static void main(String[] args) {
        gameInit("countries.txt");
    }

    public static void gameInit(String fileName){

        FileManager manager = new FileManager();
        manager.cityCapitalsInit(fileName);
        Game game = new Game(manager.getCityCapitals());
        ConsoleUI ui = new ConsoleUI();
        GameManager control = new GameManager(game, ui, manager);

        control.play();
    }
}
