package pkg;
import Parent.*;
public class Child1 extends Parent
{
    public Child1()
    {
        super("Gupta");
        System.out.println("I'm Constructor of Child1");
    }
    public void  proc1()
    {
        System.out.println("Child1 proc1");
    }
    public void proc1(String Name)
    {
        System.out.println("I'm Proc1() in child1"+Name);
    }
}