package tascaS103.nivell01.exercici01;

public class Month {

    // Attributes
    private String name;

    // Constructor
    public Month(String name) {
        this.name = name;
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }
    // Getters
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}
