package tascaS103.nivell01.exercici01;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}
