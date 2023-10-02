import java.util.Scanner;
public class Second
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),f=1;
        while(a>=1)
        {
            f*=a;
            a--;
        }
        System.out.println("Factorial of given number is : "+f);
        

    }
}