import pkg.Child1;
import Parent.*;

public class Main 
{
    public static void main(String[] args) {
        System.out.println("Type Child for Making th Object of Child Class");
        System.out.println("Type Child1 for Making th Object of Child1 Class");

        Child1 p=(Child1)(Parent.Factory("Child1"));

        // p.proc1("Nit");


    }
}