package tascaS102.nivell02;

import java.util.Scanner;

// Prompt user and check input. Show an error message until the input is correct
public class ConsoleReader {

    private static Scanner input = new Scanner(System.in);

    public static void readByte(String message){
        System.out.println("Enter a byte:");
        String userValue = input.nextLine();
    }

    public static void readInt(String message){
        System.out.println("Enter an integer value:");
    }

    public static void readFloat(String message){
        System.out.println("Enter a float value:");
    }

    public static void readDouble(String message){
        System.out.println("Enter a double value:");
    }
}
