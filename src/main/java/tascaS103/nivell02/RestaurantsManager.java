package tascaS103.nivell02;

import java.util.ArrayList;

public class RestaurantsManager {
    FileManager fileManager;
    RestaurantsTable restaurants;

    public RestaurantsManager(){
        this.fileManager = new FileManager();
        this.restaurants = new RestaurantsTable();
    }

    public RestaurantsTable getTable(){
        return this.restaurants;
    }

    public void restaurantsInit(String fileName){
        ArrayList<String> lines = this.fileManager.getFileLines(fileName);

        for(int i = 0; i < lines.size(); i++){
            String[]parts = lines.get(i).split(";");
            String name = parts[0];

            try{
                int score = Integer.parseInt(parts[1]);

                Restaurant restaurant = new Restaurant(name, score);

                this.restaurants.addRestaurant(restaurant);
            }catch(NumberFormatException e){
                System.out.println(Message.E_WRONG_FORMAT_FILE);
            }
        }
    }
}
