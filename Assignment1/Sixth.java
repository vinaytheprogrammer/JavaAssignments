import java.util.Scanner;
public class Sixth {

    public static void main(String args[])
    {
        int l=args.length;
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<l;i++)
        {
            if(a[i]==x)
            {
                System.out.println("is a member of the array!");
                return;
            }
        }
        System.out.println("is not a member of the array!");

    }
    
}
