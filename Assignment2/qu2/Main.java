import java.util.*;

class Vector
{
    double a[]=new double[3];
    Vector()
    {
    
    }
    Vector(double arr[])
    {
        for(int i=0;i<3;i++)
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
    
    public void multiply(double x)
    {
        for(int i=0;i<3;i++)
        {
            a[i]=a[i]*x;
        }
    }

    public Vector multiply(Vector v)
    {
        Vector res=new Vector();
        res.a[0]=a[1]*v.a[2]+v.a[1]*a[2];
        res.a[1]=a[0]*v.a[2]+a[2]*a[0];
        res.a[2]=a[0]*v.a[1]+a[1]*v.a[0];
        return res;
    }

}   

public class Main
{
    public static void main(String[] args) {
        
        // int n;
        // System.out.println("Enter Size of the Array");
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        double a[]=new double[3];
        double b[]=new double[3];

        Scanner sc =new Scanner(System.in);
        

        System.out.println("1. Scaler Multiplication\n2. Vector Multiplication");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter First Vector ");;
                for(int i=0;i<3;i++)
                {
                    a[i]=sc.nextDouble();
                }

                Vector v1=new Vector(a);            
                System.out.println("Give A Single Constant Quatity");
                Double x=sc.nextDouble();
                v1.multiply(x);
                System.out.println("Updated Vector is "); 
                for(int i=0;i<3;i++)
                {
                    System.out.print( v1.a[i]+" ");
                }
                System.out.println();     
                break;            
            }

            case 2:
            {
                System.out.println("Enter First Vector ");;
                for(int i=0;i<3;i++)
                {
                    a[i]=sc.nextDouble();
                }
                System.out.println("Enter Second Vector ");;
                for(int i=0;i<3;i++)
                {
                    b[i]=sc.nextDouble();
                }
                Vector v1 =new Vector(a);
                Vector v2 =new Vector(b);
                Vector v3 =new Vector();

                v3=v1.multiply(v2);
                System.out.println("Updated Vector is "); 
                for(int i=0;i<3;i++)
                {
                    System.out.print("" + v3.a[i]+" ");
                }


            }
        }
        

        // for(int i=0;i<3;i++)
        // {
        //     b[i]=sc.nextDouble();
        // }
        

        // Vector v2=new Vector(v1);
        // for(int i=0;i<3;i++)
        // {
        //     System.out.print("Vector 2: " + v2.a[i]);
        // }                    
        // System.out.println(); 


        // v1.set(0,7);
        // for(int i=0;i<3;i++)
        // {
        //     System.out.print("Vector 1: " + v1.a[i]);
        // }
        // System.out.println(); 
        
        // double m=v1.get(1);
        // System.out.println("Returned value from Get is "+m);

    }
}