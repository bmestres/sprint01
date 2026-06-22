package tascaS103.nivell02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RestaurantsTable {

    private Set<Restaurant> restaurants;

    public RestaurantsTable() {
        this.restaurants = new HashSet<Restaurant>();

    }

    public HashSet<Restaurant> getRestaurants(){
        return new HashSet<Restaurant>(this.restaurants);
    }

    public void addRestaurant(Restaurant restaurant){
        this.restaurants.add(restaurant);
    }

    public ArrayList<Restaurant> sortRestaurants(){
        ArrayList<Restaurant> sortedRestaurants = new ArrayList<Restaurant>(this.restaurants);
        int i, j;

        for(i = 1; i < sortedRestaurants.size(); i++){
            Restaurant tmpRestaurant = sortedRestaurants.get(i);
            j = i - 1;

            while(j >= 0 && sortedRestaurants.get(j).compareTo(tmpRestaurant) > 0){
                sortedRestaurants.set(j + 1, sortedRestaurants.get(j));
                j--;
            }
            sortedRestaurants.set(j + 1, tmpRestaurant);
        }
        return sortedRestaurants;
    }
}

