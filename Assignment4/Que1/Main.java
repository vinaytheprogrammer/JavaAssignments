class Parent
{
    Parent(){
        System.out.println("Parent Constructor()");
    }
    public void proc1()
    {
        System.out.println("I'm Proc1() in Parent");
    }
    // void proc1(int n)
    // {
    //     System.out.println("In parent");
    // }
}

class Child extends Parent
{
    public void proc1()
    {
        System.out.println("I'm Proc1() in child");
    }
}

class Main 
{
    public static void main(String[] args) {
        Parent p=new Child();
        p.proc1();
        // p.proc1(5);

    }
}