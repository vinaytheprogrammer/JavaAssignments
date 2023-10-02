class InvalidEntryException extends Exception {
    public InvalidEntryException(String msg) {
        super(msg);
    }
}

class Person {
    String name;
    int age;

    public Person(String n, int a) throws InvalidEntryException {
        name = n;
        if (a < 0) {
            throw new InvalidEntryException("Age can not be less than 0");
        }
        age = a;
    }

    String named() {
        return name;
    }

    int aged() {
        return age;
    }

}

public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Vinay", 17);
            Person person2 = new Person("Vinay", -1);
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
        }
    }
}
