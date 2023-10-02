class Base
{
    int age;
    String name;

    Base(int age_value,String name_value)
    {
        age=age_value;
        name=name_value;
    }

    int getAge() { return age;}
    String getName() { return name;}

    void show()
    {
        System.out.println("NAME : "+name+", AGE : "+age);
    }

}

class derived extends Base
{
    int child_age;
    String child_name;

    derived(int Cage,String Cname)
    {
        super(Cage,Cname);
        child_name=Cname;
        child_age=Cage;
    }

    int getChildAge() { return child_age;}
    String getChildName() { return child_name;}

    void show1()
    {
        System.out.println("Child_NAME : "+child_name+", Child_AGE : "+child_age);
    }
}

public class Practice1 {
    public static void main(String args[])
    {
        derived D=new derived(0,null);
        D.age=25;
        D.child_age=17;
        D.child_name="Vinay";
        D.name="Prince";
        D.show();
        D.show1();
    }
}

