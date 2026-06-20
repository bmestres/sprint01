package tascaS103.nivell01.exercici03.Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class GameControl {

    private static final int INITIAL_STATE = 0;
    public static final int MAX_QUESTIONS = 10;
    private FileManager manager;
    private final Map<String, String> cityCapitals;
    private List<String> countryQuestions;
    private String currQuestion;
    private String playerName;
    private int rounds;
    private int score;


    public GameControl(Map<String, String> cityCapitals) {
        this.cityCapitals = cityCapitals;
        this.rounds = INITIAL_STATE;
        this.score = INITIAL_STATE;
        this.currQuestion = "";
    }

    public ArrayList<String>getCountryQuestions(){
        return new ArrayList<String>(this.countryQuestions);
    }

    public int getScore(){
        return this.score;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setPlayerName(String name){
        this.playerName = name;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    // All country names are stored and shuffled randomly
    public void prepareGame(){
        this.countryQuestions = new ArrayList<>(this.cityCapitals.keySet());
        Collections.shuffle(this.countryQuestions);
    }

    public boolean thereAreMoreQuestionsLeft(){
        return this.rounds < MAX_QUESTIONS;
    }

    public String nextQuestion(){
        this.currQuestion = this.countryQuestions.get(this.rounds);
        this.rounds++;
        return currQuestion;
    }

    public boolean processAnswer(String userAnswer){
        String correctAnswer = this.cityCapitals.get(this.currQuestion);
        if(userAnswer.equalsIgnoreCase(correctAnswer)){
            this.score++;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return String.format("Player: %s\nScore: %d", this.playerName, this.score);
    }
    }



