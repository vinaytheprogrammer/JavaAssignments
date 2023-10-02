
class Employee
{
    String name;    String id;    String office;    String designation;

    Employee(String N,String I,String O,String D)
    {
        this.name=N;this.id=I;this.office=O;this.designation=D;
    }
}
class Developer extends Employee
{
    Developer(String N,String I,String O)
    {
        super(N,I,O,"developer");
    }
}
class Manager extends Employee
{
    Manager(String N,String I,String O)
    {
        super(N,I,O,"Manager");
    }
}



public class Main {

    public static void main(String[] args) {

        
        
    }
    
}