package tascaS103.nivell01.exercici03.Class;

/* Links and manages the three main classes; state of game, user interface and read/write
* to memory */
public class GameControl {

    private final Game game;
    private final ConsoleUI ui;
    private final FileManager manager;

    public GameControl(Game game, ConsoleUI ui, FileManager manager){
        this.game = game;
        this.ui = ui;
        this.manager = manager;
    }

    public void play(){
        boolean exit = false;
        while(!exit){
            String userName = ui.askUserName();
            game.init(userName);

            while(game.thereAreMoreQuestionsLeft()){
                String country = game.nextQuestion();
                String answer = ui.askQuestion(game.getRounds(), country);
                boolean isCorrect = game.processAnswer(answer);
                ui.displayOutcome(isCorrect, game.getScore());
            }
            ui.displayFinal(game.getScore());
            manager.saveGame(game.toString(), "scores.txt");
            exit = ui.promptQuit();
        }
    }
}
