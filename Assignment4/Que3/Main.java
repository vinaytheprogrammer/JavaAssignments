class Parent
{
    
    Parent(String name){
        System.out.println("Parent Constructor() "+name);
    }
    static 
    {
        System.out.println("NAME : StaticParent");
    }
    public void proc1()
    {
        System.out.println("I'm Proc1() in Parent");
    }
    
    static Parent Factory(String s)
    {
        switch(s)
        {
            case "Child" : return new Child();
            case "Child1" : return new Child1();
            default :  return null;
        }
    }
}

class Child extends Parent
{
    Child()
    {
        super("Vinay");
    }
    static
    {
        System.out.println("NAME : StaticChild");
    }
    public void proc1()
    {
        System.out.println("I'm Proc1() in child");
    }
}

class Child1 extends Parent
{
    Child1()
    {
        super("Gupta");
        System.out.println("I'm Constructor of Child1");
    }
    public void proc1(String Name)
    {
        System.out.println("I'm Proc1() in child1"+Name);
    }
}
public class Main 
{
    public static void main(String[] args) {
        System.out.println("Type Child for Making th Object of Child Class");
        System.out.println("Type Child1 for Making th Object of Child1 Class");

        Child1 p=(Child1)(Parent.Factory("Child1"));

        p.proc1("Nit");


    }
}