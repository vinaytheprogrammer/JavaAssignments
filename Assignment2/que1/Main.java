import java.util.*;

class Vector
{
    double a[];
    Vector(double arr[],int n)
    {
        a=new double[n];
        for(int i=0;i<n;i++)
            a[i]=arr[i];
    }

    Vector(Vector v)
    {
        int n=v.a.length;
        a=new double[n];

        for(int i=0;i<n;i++)
        {
            a[i]=v.a[i];
        }    
    }

    public void set(int index, double value) {
        if (index < 0 || index >= a.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        a[index] = value;
    
    }
 
    public double get(int index) {
        if (index < 0 || index >= a.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return a[index];
    }
    
}   

public class Main
{
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter Size of the Array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextDouble();
        
        Vector v1=new Vector(a,n);            
        for(int i=0;i<n;i++)
        {
            System.out.print( v1.a[i]+" ");
        }
        System.out.println(); 

        Vector v2=new Vector(v1);
        for(int i=0;i<n;i++)
        {
            System.out.print( v2.a[i]+" ");
        }                    
        System.out.println(); 


        v1.set(0,7);
        for(int i=0;i<n;i++)
        {
            System.out.print( v1.a[i]+" ");
        }
        System.out.println(); 
        
        double m=v1.get(1);
        System.out.println("Returned value from Get is "+m);

    }
}