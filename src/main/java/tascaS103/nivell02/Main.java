package tascaS103.nivell02;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        RestaurantsManager manager = new RestaurantsManager();
        manager.restaurantsInit("restaurants.txt");

        System.out.println("Original HashSet:");
        HashSet<Restaurant> restaurants = manager.getTable().getRestaurants();
        System.out.print(restaurants);
        System.out.println();
        System.out.println();

        System.out.println("Attempt to add a duplicate:");
        Restaurant newRestaurant01 = new Restaurant("Atipical", 7);
        manager.getTable().addRestaurant(newRestaurant01);
        restaurants = manager.getTable().getRestaurants();
        System.out.print(restaurants);
        System.out.println();
        System.out.println();

        System.out.println("Added existent restaurant with different score:");
        Restaurant newRestaurant02 = new Restaurant("Atipical", 6);
        manager.getTable().addRestaurant(newRestaurant02);
        restaurants = manager.getTable().getRestaurants();
        System.out.print(restaurants);
        System.out.println();
        System.out.println();

        System.out.println("Sorted by name, and secondly by score:");
        ArrayList<Restaurant> sortedRestaurants = manager.getTable().sortRestaurants();
        manager.getTable().sortRestaurants();
        System.out.print(sortedRestaurants);
    }
}
