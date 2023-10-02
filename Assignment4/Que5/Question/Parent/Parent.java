package Parent;
import pkg.*;

public abstract class Parent
{
    private int a;
    int b;
    public int c;
    protected int d;
    Parent(int x,int y, int z,int w)
    {
        a=x;
        b=y;
        c=z;
        d=w;
    }
    protected Parent(String name){
        System.out.println("Parent Constructor() "+name);
    }
    static 
    {
        System.out.println("NAME : StaticParent");
    }
    public abstract void proc1();
   
    
    public static Parent Factory(String s)
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


