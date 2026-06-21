package tascaS103.nivell01.exercici03.Class;

import static tascaS103.nivell01.exercici03.Class.Game.MAX_QUESTIONS;

public class ConsoleUI {

    public String askUserName(){
        System.out.println(Message.U_WELCOME);
        String userName = ConsoleReader.readString(Message.U_ENTER_NAME).toUpperCase();
        System.out.printf(Message.U_HELLO_NAME, userName);
        System.out.println();
        System.out.println(Message.U_GUESS_CAPITAL);
        return userName;
    }

    public String askQuestion(int round, String question){
        System.out.printf(Message.U_COUNTRY_NUMBERS, round);
        System.out.printf("%s", question);
        String userAnswer = ConsoleReader.readString("");
        return userAnswer;
    }

    public void displayOutcome(boolean isCorrect, int score){
        if(isCorrect){
            System.out.println(Message.U_CORRECT);
        } else {
            System.out.println(Message.U_INCORRECT);
        }
        displayScore(score);
    }

    public void displayScore(int score){
        System.out.printf(Message.U_SCORE, score);
    }

    public void displayFinal(int score){
        System.out.println();
        System.out.printf(Message.U_FINAL, score);
    }

    public boolean promptQuit(){
        String userChoice = ConsoleReader.readString(Message.U_EXIT_PROMPT);
        boolean quit = false;

        if(userChoice.equalsIgnoreCase("q")){
            System.out.println(Message.U_GOODBYE);
            quit = true;
        }
        return quit;
    }
}
