package tascaS103.nivell01.exercici02;

public class Main {

    public static void main(String[] args) {

        IntegerManager manager01 = new IntegerManager();
        manager01.fillList();
        manager01.printList(Message.U_ARRAY_LIST_INT);

        IntegerManager manager02 = new IntegerManager();
        manager02.fillListReverse();
        manager02.printList(Message.U_ARRAY_LIST_INT_REVERSE);

        manager02.iterateAndCopy(manager01.getList());
        manager02.printList(Message.U_ARRAY_LIST_ADD);
    }
}
