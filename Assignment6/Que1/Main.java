// package Que1;
class InvalidEntryException extends Exception {
    public InvalidEntryException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            
            throw new InvalidEntryException("This is an invalid entry.");
        } catch (InvalidEntryException e) {
            // Print the message without "InvalidEntryException: " prefix
            System.out.println(e.getMessage());

            // Print the full exception with the prefix
            System.out.println(e);
        }
    }
}
