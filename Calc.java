import java.util.Scanner;

public class Calc {


    public static void main(String args[])
    {
        System.out.println("Enter Marks in Higher Secondary Board ");
        Scanner sc=new Scanner(System.in);
        Float Marks= sc.nextFloat();
        System.out.println(Marks);
        Float percentage=Marks/5;
        System.out.println(calc(percentage));

    }
    
}


double calc(float percentage)
{
    double result=percentage/9.5;
    return result;
}