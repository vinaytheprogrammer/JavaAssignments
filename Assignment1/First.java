// package javat.assignment1;

import java.util.*;


public class First
{
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       for(int i=2;i*i<=a;i++)
       {
        if(a%i==0)
        {
            System.out.println("composite");
            return;
        }        
       } 
       System.out.println("prime");

    }
}