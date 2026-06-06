package nivell03.exercici01;

import java.util.Scanner;

// Mainline control
public class Main {

    static void main(String[] args) {

        // Create objects
        Menu userMenu = new Menu();
        Scanner input = new Scanner(System.in);
        Redaccio redaccio = new Redaccio();
        int userChoice;

        do {
            userMenu.displayMenu();
            userChoice = input.nextInt();
            input.nextLine();

            // Ensure user choice is in range
            if(userChoice < 1 || userChoice > 7){
                System.out.println("=== Incorrect number. Choose an option from 1 to 7. ===");
            }
        } while(userChoice < 1 || userChoice > 7);

        switch(userChoice){
            case 1: {
                String name;
                String nif;


                Redactor redactor = new Redactor(name, nif);



            }
        }
    }
}
