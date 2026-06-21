package tascaS103.nivell02;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

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
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Restaurant other) {
        if (other == null) {
            throw new NullPointerException(Messages.E_NULL_COMPARE);
        }
        int compare = this.name.compareToIgnoreCase(other.name);

        if(compare == 0){
            return Integer.compare(other.score, this.score);
        }
        return compare;
    }
}




