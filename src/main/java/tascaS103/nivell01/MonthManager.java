package tascaS103.nivell01;

import java.util.ArrayList;
import java.util.List;

public class MonthManager {

    private static final String[] MONTHS_NAMES = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    private List<Month>monthsList;

    public MonthManager(){
        this.monthsList = new ArrayList<>();
    }

    public List<Month> getList(){
        return new ArrayList<>(this.monthsList);
    }

    public void addMonth(Month month){
        this.monthsList.add(month);
    }

    public void addMonths(){
        for(int i = 0; i < MONTHS_NAMES.length; i++){

            if(!MONTHS_NAMES[i].equals("August")){
                Month currMonth = new Month(MONTHS_NAMES[i]);
                addMonth(currMonth);
            }
        }
    }

    public static void printList(String message, List<Month>monthsList){
        System.out.println(message);
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
