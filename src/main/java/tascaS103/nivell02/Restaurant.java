package tascaS103.nivell02;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    @Override
    public boolean equals(Object object) {
        if(object == this){
            return true;
        }
        if(!(object instanceof Restaurant)){
            return false;
        }
        Restaurant restaurant = (Restaurant)object;
        return this.name.equalsIgnoreCase(restaurant.name) && this.score == restaurant.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}


