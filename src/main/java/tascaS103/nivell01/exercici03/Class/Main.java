package tascaS103.nivell01.exercici03.Class;


public class Main {

    public static void main(String[] args) {

        gameInit();
    }

    public static void gameInit(){

        FileManager manager = new FileManager();
        manager.cityCapitalsInit("countries.txt");

        Game game = new Game(manager.getCityCapitals());
        ConsoleUI ui = new ConsoleUI();
        GameManager control = new GameManager(game, ui, manager);

        control.play();
    }
}
