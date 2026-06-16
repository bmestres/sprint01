package tascaS103.nivell01;

import java.util.ArrayList;

public class Main {
    /*
    Creates an initial ArrayList adding all months except august and shows them on screen.
    Then adds august at its correct index and shows new result.
     */
    public static void main(String[] args) {
        ArrayList<Month>monthsList = new ArrayList<Month>();

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        monthsList.add(january);
        monthsList.add(february);
        monthsList.add(march);
        monthsList.add(april);
        monthsList.add(may);
        monthsList.add(june);
        // August missing
        monthsList.add(july);
        monthsList.add(september);
        monthsList.add(october);
        monthsList.add(november);
        monthsList.add(december);

        // Show initial list
        System.out.println("Initial list:");
        for(int i = 0; i < monthsList.size(); i++){
            System.out.printf("%s", monthsList.get(i).toString());
            if(i < monthsList.size() - 1){
                System.out.print(", ");
            } else {
                System.out.print(".\n");
            }
        }
        System.out.println();

        // Insert august to its correct position
        monthsList.add(7, august);

        // Show new list
        System.out.println("New list:");
        for(int i = 0; i < monthsList.size(); i++){
            System.out.printf("%s", monthsList.get(i).toString());
            if(i < monthsList.size() - 1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }
}
