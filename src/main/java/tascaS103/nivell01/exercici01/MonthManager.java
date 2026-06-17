package tascaS103.nivell01.exercici01;

import java.util.*;

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

    public HashSet<Month> convertToSet(List<Month>list){
        HashSet<Month>monthsSet = new HashSet<Month>(list);
        return monthsSet;
    }

    public void addMonth(Month month){
        this.monthsList.add(month);
    }

    public void insertMonth(int pos, Month month){
        this.monthsList.add(pos, month);
    }

    public void fillWithMonthsNoAug(){
        for(int i = 0; i < MONTHS_NAMES.length; i++){
            if(!MONTHS_NAMES[i].equals("August")){
                Month currMonth = new Month(MONTHS_NAMES[i]);
                addMonth(currMonth);
            }
        }
    }

    public void printList(String message){
        System.out.println(message);
        System.out.print(this.monthsList);
        System.out.println();
        System.out.println();
    }

    public void printHashSet(String message, HashSet<Month>set){
        System.out.println(message);
        System.out.print(set);
        System.out.println();
        System.out.println();
    }

    public void traverseWithForLoop(String message, HashSet<Month>set){
       System.out.println(message);
        int i = 0;

        for(Month m : set){
            System.out.printf("Elem %d: %s\n", i, m);
            i++;
        }
        System.out.println();
    }
    public void traverseWithIterator(String message, HashSet<Month>set){
        Iterator<Month>iterator = set.iterator();
        System.out.printf(message);
        System.out.println();
        while(iterator.hasNext()){
            System.out.printf("%s\n", iterator.next());
        }
        System.out.println();
    }
}
