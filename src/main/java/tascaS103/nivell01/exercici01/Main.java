package tascaS103.nivell01.exercici01;

import java.util.HashSet;

public class Main {
    /*
    Creates an initial ArrayList adding all months except august and shows them on screen.
    Then adds august at its correct position and shows new result.
     */
    public static void main(String[] args) {

        MonthManager manager = new MonthManager();

        manager.fillWithMonthsNoAug();
        manager.printList(Message.U_FIRST_LIST);

        Month august = new Month("August");
        manager.insertMonth(7, august);

        manager.printList(Message.U_MODIFIED_LIST);

        manager.insertMonth(7, august);
        manager.printList(Message.U_DUPLICATED_LIST);

        HashSet monthsSet = manager.convertToSet(manager.getList());

        manager.printHashSet(Message.U_LIST_TO_HASHSET, monthsSet);

        manager.traverseWithForLoop(Message.U_TRAVERSE_WITH_FOR, monthsSet);

        manager.traverseWithIterator(Message.U_TRAVERSE_WITH_ITERATOR, monthsSet);
    }
}
