package tascaS102.nivell02;

import java.util.InputMismatchException;
import java.util.Scanner;

// Prompt user and check input. Show an error message until the input is correct
public class ConsoleReader {

    private static Scanner inputScanner = new Scanner(System.in);

    // Prompts user tu input byte and returns value
    public static byte readByte(String message){

        byte formatedByte = 0;
        boolean correctInput = false;

        do {
        System.out.println(Message.ENTER_BYTE);
        String userInput = inputScanner.nextLine();

        try {
            formatedByte = Byte.parseByte(userInput);
            inputScanner.nextLine();
            correctInput = true;

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            inputScanner.nextLine();
        }
        } while(!correctInput);
        return formatedByte;
    }

    // Prompts user to input an integer and returns value
    public static int readInt(String message){
        int formatedInt = 0;
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_INT);
            String userInput = inputScanner.nextLine();

            try {
                formatedInt = Integer.parseInt(userInput);
                inputScanner.nextLine();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                inputScanner.nextLine();
            }
        }while(!correctInput);

        return formatedInt;
    }

    // Prompts user to input float and returns value
    public static float readFloat(String message){

            float formatedFloat = 0;
            boolean correctInput = false;

        System.out.println(Message.ENTER_FLOAT);
        String userInput = inputScanner.nextLine();

        try {
            formatedFloat = Float.parseFloat(userInput);
            inputScanner.nextLine();
            correctInput = true;

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            inputScanner.nextLine();
        } while (!correctInput);

        return formatedFloat;
    }
    // Prompts user to input a double and returns value
    public static double readDouble(String message){

        double formatedDouble = 0;
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_DOUBLE);
            String userInput = inputScanner.nextLine();

            try{
                formatedDouble = Double.parseDouble(userInput);
                inputScanner.nextLine();
                correctInput = true;

            } catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputScanner.nextLine();
            }
        }while(!correctInput);

        return formatedDouble;
    }

    // Prompts user to input character and returns value
    public static char readChar(String message){
        char formatedChar = 0;
        boolean correctInput = false;

        do {
            System.out.println(Message.ENTER_CHARACTER);
            String userInput = inputScanner.nextLine();

            try {
                if (userInput.length() > 1) {
                    throw new MultipleCharacterException();
                }
                formatedChar = userInput.charAt(0);
                correctInput = true;

            } catch (MultipleCharacterException e) {
                System.out.println(e.getMessage());
            }
        } while (!correctInput) ;
        return formatedChar;
    }
    // Prompts user to input a word and returns string
    public static String readString(String message){

        String formatedString = "";
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_STRING);
            String userInput = inputScanner.nextLine();

            try{
                if(userInput.length() < 3){
                    throw new ShortStringException();
                }
                formatedString = userInput;
                correctInput = true;

            }catch(ShortStringException e){
                System.out.println(e.getMessage());
            }
        }while(!correctInput);
    return formatedString;
    }

    public static boolean readYesNo(String message){
        boolean formatedBool = false;
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_BOOLEAN);
            String userInput = inputScanner.nextLine();

            try{
                if(userInput != "y" || userInput != "n"){
                    throw new YesNoException();
                }
                formatedBool = Boolean.parseBoolean(userInput);
                correctInput = true;

            }catch(YesNoException e) {
                System.out.println(e.getMessage());
            }
        }while (!correctInput);

        return formatedBool;
    }
}
