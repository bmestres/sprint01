package tascaS102.nivell01;

public class Main {
    // Tests exceptions
    public static void main(String[] args) {
        // Forcing a custom Empty Sale Exception
        TestEmptySell.performTest();
        // Forcing an out-of-bounds exception
       TestOutOfBounds.performTest();
    }
}
