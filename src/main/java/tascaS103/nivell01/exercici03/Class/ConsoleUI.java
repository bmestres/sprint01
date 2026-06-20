package tascaS103.nivell01.exercici03.Class;

import java.util.ArrayList;

import static tascaS103.nivell01.exercici03.Class.GameControl.MAX_QUESTIONS;

public class ConsoleUI {

    private final GameControl game;

    public ConsoleUI(GameControl game){
        this.game = game;
    }

    public String start(){
        boolean exit = false;
        do{
            this.game.setPlayerName(askUserName());
            this.game.prepareGame();

            while(game.thereAreMoreQuestionsLeft()){
                String userAnswer = askQuestion();

                displayQuestionOutcome(userAnswer);
                if(game.getRounds() != MAX_QUESTIONS){
                    displayScore();
                }
            }

            displayFinal();
            String userChoice = promptQuit();



        } while (!exit);

        return game.toString();
    }

    private String askUserName(){
        System.out.println(Message.U_WELCOME);
        String userName = ConsoleReader.readString(Message.U_ENTER_NAME);
        System.out.printf(Message.U_HELLO_NAME, userName.toUpperCase());
        System.out.println();
        System.out.println(Message.U_GUESS_CAPITAL);
        return userName;
    }

    private String askQuestion(){
        System.out.printf(Message.U_COUNTRY_NUMBERS, game.getRounds() + 1);
        System.out.printf("%s", game.nextQuestion());
        String userAnswer = ConsoleReader.readString("");
        return userAnswer;
    }

    private void displayQuestionOutcome(String userAnswer){
        if(game.processAnswer(userAnswer)){
            System.out.println(Message.U_CORRECT);
        } else {
            System.out.println(Message.U_INCORRECT);
        }

    }
    private void displayScore(){
        System.out.printf(Message.U_SCORE, this.game.getScore());
        System.out.println();
    }

    private void displayFinal(){
        System.out.println();
        System.out.printf(Message.U_FINAL, game.getScore());
    }

    private String promptQuit(){
        String userChoice = ConsoleReader.readString(Message.U_EXIT_PROMPT);
        return userChoice;
    }
}
