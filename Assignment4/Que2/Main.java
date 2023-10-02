class Parent
{
    
    Parent(String name){
        System.out.println("Parent Constructor() "+name);
    }
    static 
    {
        System.out.println("NAME : VinayParent");
    }
    public void proc1()
    {
        System.out.println("I'm Proc1() in Parent");
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
        System.out.println("NAME : VinayChild");
    }
    public void proc1()
    {
        System.out.println("I'm Proc1() in child");
    }
}

public class Main 
{
    public static void main(String[] args) {
         Parent p=new Child();
     
        // p.proc1();
        // p.proc1(5);

    }
}