package tascaS103.nivell02;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name = name;
        this.score = score;

    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant restaurant = (Restaurant) object;
        return this.name.equalsIgnoreCase(restaurant.name) && this.score == restaurant.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), score);
    }

    @Override
    public int compareTo(Restaurant other) {
        if (other == null) {
            throw new NullPointerException(Message.E_NULL_COMPARE);
        }
        int compare = this.name.compareToIgnoreCase(other.name);

        if(compare == 0){
            return Integer.compare(other.score, this.score);
        }
        return compare;
    }

    @Override
    public String toString() {
        return String.format("Restaurant %s - Score: %d", this.name, this.score);
    }
}




