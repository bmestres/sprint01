package tascaS102.nivell02;

public class Main {

    public static void main(String[] args) {

        byte userByte = ConsoleReader.readByte(Message.ENTER_BYTE);
        System.out.printf(Message.RESULT_BYTE, userByte);

        int userInt = ConsoleReader.readInt(Message.ENTER_BYTE);
        System.out.printf(Message.RESULT_INT, userInt);

        float userFloat = ConsoleReader.readFloat(Message.ENTER_FLOAT);
        System.out.printf(Message.RESULT_FLOAT, userFloat);

        double userDouble = ConsoleReader.readDouble(Message.ENTER_DOUBLE);
        System.out.printf(Message.RESULT_DOUBLE, userDouble);

        char userChar = ConsoleReader.readChar(Message.ENTER_CHARACTER);
        System.out.printf(Message.RESULT_CHARACTER, userChar);

        String userString = ConsoleReader.readString(Message.ENTER_STRING);
        System.out.printf(Message.RESULT_STRING, userString);

        boolean userBoolean = ConsoleReader.readYesNo(Message.ENTER_BOOLEAN);
        System.out.printf(Message.RESULT_BOOLEAN, userBoolean);
    }
}
