interface Iface1
{
    void im1();
    private void choice(){
        System.out.println("I'm Choice()");
    }
    default void dm1()
    {
        System.out.println("I'm dm1()");
        choice();
    }

}

class concrete implements Iface1
{
    public void im1()
    {
        System.out.println("I'm im1()" );
        
    }

}

class Main 
{
    public static void main(String[] args) {
        concrete obj=new concrete();
        // obj.choice();
        obj.dm1();
        obj.im1();
    }
}