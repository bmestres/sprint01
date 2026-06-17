package tascaS103.nivell01.exercici02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IntegerManager {

    private static final int numbers[] = {4, 7, 12, 8, 3, 17, 12, 1};
    private List<Integer> list;


    public IntegerManager(){
        this.list = new ArrayList<>();
    }

    public ArrayList<Integer> getList(){
        return new ArrayList<Integer>(this.list);
    }

    public void fillList(){
        for(int i = 0; i < this.numbers.length; i++){
            this.list.add(numbers[i]);
        }
    }

    public void fillListReverse(){
        for (int i = this.numbers.length - 1; i >= 0; i--){
            this.list.add(numbers[i]);
        }
    }

    public void iterateAndCopy(List<Integer> src){
        ListIterator<Integer> intIterator = src.listIterator();
        while(intIterator.hasNext()){
            this.list.add(intIterator.next());
        }
    }

    public void printList(String message){
        System.out.println(message);
        System.out.print(this.list);
        System.out.println();
    }
}
