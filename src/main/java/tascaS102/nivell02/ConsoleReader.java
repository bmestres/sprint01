package tascaS102.nivell02;

import java.util.Scanner;

// Prompt user and check input. Show an error message until the input is correct
public class ConsoleReader {

    private static Scanner input = new Scanner(System.in);

    public static byte readByte(String message){
        System.out.println("Enter a byte:");
        String userInput = input.nextLine();
        byte formatedByte = Byte.parseByte(userInput);
        return formatedByte;
    }

    public static int readInt(String message){
        System.out.println("Enter an integer:");
        String userInput = input.nextLine();
        int formatedInt = Integer.parseInt(userInput);
        return formatedInt;
    }

    public static float readFloat(String message){
        System.out.println("Enter a float value:");
        String userInput = input.nextLine();
        float formatedFloat = Float.parseFloat(userInput);
        return formatedFloat;
    }

    public static double readDouble(String message){
        System.out.println("Enter a double value:");
        String userInput = input.nextLine();
        double formatedDouble = Double.parseDouble(userInput);
        return formatedDouble;
    }

    public static char readChar(String message){
        System.out.println("Enter a character");
        char character = input.nextLine().charAt(0);
        return character;
    }
}
