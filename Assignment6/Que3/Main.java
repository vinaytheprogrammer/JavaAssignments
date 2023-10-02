class InvalidEntryException extends Exception {
    public InvalidEntryException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        if (getCause() != null) {
            message += " caused by " + getCause().toString();
        }
        return message;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidEntryException {
        this.name = name;
        if (age < 0) {
            throw new InvalidEntryException("Invalid age provided", new IllegalArgumentException("Age cannot be less than 0"));
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Create Person objects
            Person person1 = new Person("Alice", 25);
            Person person2 = new Person("Bob", -5); // Throws InvalidEntryException
        } catch (InvalidEntryException e) {
            // Print the modified exception message including the cause
            System.out.println(e.getMessage());
        }
    }
}
