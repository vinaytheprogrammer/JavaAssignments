import java.util.Scanner;

/*
 * Create a static variable count and static method getEmployeeCount() that will return the number of
 * Employee objects created thus far (Hint: increase the static variable each time an Employee object is
 * created).
 */
abstract class Employee {
    String name;
    String id;
    String office;
    String designation;
    static int count;


    Employee(String N, String I, String O, String D) {
        this.name = N;
        this.id = I;
        this.office = O;
        this.designation = D;
        count++;
    }
    static int getEmployeeCount()
    {
        return count;
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

/*
 * Main 
 */
public class Main {

    public static void main(String[] args) {

        Employee e = Employee.getEmployee("Developer");
        e.insert();
        e.delete();
        e = Employee.getEmployee("Manager");
        e.insert();
        e.delete();
        System.out.println("Total no. of employees so far : "+Employee.getEmployeeCount());
    }

}