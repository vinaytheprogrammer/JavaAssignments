import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        performDivisionByZeroWithoutCatch();

        System.out.println("This line will not be reached if an exception occurs.");

        try {
            performDivisionByZeroWithCatch();
        } catch (ArithmeticException e) {

            System.out.println("Caught exception: " + e.toString());
        }

        System.out.println("The program continues after catching the exception.");
    }

    
    public static void performDivisionByZeroWithoutCatch() {
        int numerator = 10;
        int denominator = 0;
        int result = numerator / denominator; // This will throw an ArithmeticException
    }

    
    public static void performDivisionByZeroWithCatch() {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // This catch block will handle the exception
        }
    }
}
