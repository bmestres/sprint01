package tascaS103.nivell01.exercici03.Class;

import tascaS103.nivell01.exercici03.Exception.StringWithNumbersException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner inputScanner = new Scanner(System.in);

    public static int readInt(String message) {
        int formatedInt = 0;
        boolean correctInput = false;

        do {
            System.out.println(message);
            try {
                formatedInt = inputScanner.nextInt();
                inputScanner.nextLine();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println(Message.E_FORMAT_ERROR);
                inputScanner.nextLine();
            }
        } while (!correctInput);

        return formatedInt;
    }

    public static String readString(String message) {
        String formatedString = "";
        boolean correctInput = false;

        do {
            System.out.println(message);
            formatedString = inputScanner.nextLine();

            try {
                if (formatedString.matches(".*\\d.*")) {
                    throw new StringWithNumbersException();
                }
                correctInput = true;
            } catch (InputMismatchException e) {
                System.out.println(Message.E_FORMAT_ERROR);
            } catch (StringWithNumbersException e) {
                System.out.println(e.getMessage());
            }
        } while (!correctInput);
        return formatedString;
    }
}
