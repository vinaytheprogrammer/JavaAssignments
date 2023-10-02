import java.util.*;
interface Iface1
{
    void im1();
    private void choice(){
        System.out.println("I'm Choice()");
    }
    default void dm1()
    {
        System.out.println("I'm dm1() in parent/Interface");
        // choice();
    }

    public static Iface1 factory(String s)
    {
        switch(s)
        {
            case "concrete" : {return new concrete();}
            case "concrete2" : {return new concrete2();}

            default :return new concrete();
        }
    }

}



class concrete implements Iface1
{
    public void im1()
    {
        System.out.println("I'm im1()" );
        
    }

}

class concrete2 implements Iface1{
    
    public void im1()
    {
        System.out.println("I'm im1()");
    }

    public void dm1()
    {
        System.out.println("Im dm1 in child");
    }

}
    class Main 
    {
        public static void main(String[] args) {
            // concrete obj=new concrete();
            // // obj.choice();
            // obj.dm1();
            // obj.im1();

            System.out.println("Type concrete to create object if Concrete Class");
            System.out.println("Type concrete2 to create object if Concrete2 Class");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine(); // TAking input of string 

            Iface1 obj = Iface1.factory(str);
            obj.im1();
            obj.dm1();
            
        }
    }