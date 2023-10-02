
/*
    Modify the Employee class to be an abstract class by adding two abstract methods insert() and
    delete(). The insert method in Developer will just print “Data inserted in Developer database” and
    delete method will print “Data deleted from Developer database”. Similar implementation will be
    performed in Manager class as well. (The intended implementation will be performed after discussion
    of JDBC in theory class). In Employee class, create a factory method named getEmployee(String type)
    that will return either a Developer or a Manager object, depending on the value of type. In main
    method, perform Dynamic Method Dispatch by assigning different subclss objects in same Employee
    variable using the factory method, and invoking the abstract methods from the different subclass objects
    accordingly.
 */
import java.util.Scanner;

abstract class Employee {
    String name;
    String id;
    String office;
    String designation;

    Employee(String N, String I, String O, String D) {
        this.name = N;
        this.id = I;
        this.office = O;
        this.designation = D;
    }

    static Employee getEmployee(String s) {
        String n, i, o;
        Scanner sc;
        switch (s) {
            case "Developer": {
                System.out.print("\nEnter Name : ");
                sc = new Scanner(System.in);
                n = sc.next();
                System.out.print("\nEnter ID : ");
                sc = new Scanner(System.in);
                i = sc.next();
                System.out.print("\nEnter office : ");
                sc = new Scanner(System.in);
                o = sc.next();
                return (new Developer(n, i, o));
            }

            case "Manager": {
                System.out.print("\nEnter Name : ");
                sc = new Scanner(System.in);
                n = sc.next();
                System.out.print("\nEnter ID : ");
                sc = new Scanner(System.in);
                i = sc.next();
                System.out.print("\nEnter office : ");
                sc = new Scanner(System.in);
                o = sc.next();
                return (new Manager(n, i, o));
            }
            default:
                throw new IllegalArgumentException("Unknown Employee " + s);
        }
    }

    abstract void insert();

    abstract void delete();

}

class Developer extends Employee {
    Developer(String N, String I, String O) {
        super(N, I, O, "developer");
    }

    void insert() {
        System.out.println("Data inserted in Developer Database");
    }

    void delete() {
        System.out.println("Data deleted in Developer Database");
    }
}

class Manager extends Employee {
    Manager(String N, String I, String O) {
        super(N, I, O, "Manager");
    }

    void insert() {
        System.out.println("Data inserted in Manager Database");
    }

    void delete() {
        System.out.println("Data deleted in Manager Database");
    }
}

/**
 * Main
 * 
 * In main
 * method, perform Dynamic Method Dispatch by assigning different subclss
 * objects in same Employee variable using the factory method, and invoking the
 * abstract methods from the
 * different subclass objects
 * accordingly.
 */
public class Main {

    public static void main(String[] args) {

        Employee e = Employee.getEmployee("Developer");
        e.insert();
        e.delete();
        e=Employee.getEmployee("Manager");
        e.insert();
        e.delete();

    }

}