

public class Fourth {

    public static void main(String args[])
    {
        int l=args.length;
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for(int i=1;i<l;i++)
        {
            int k=a[i];
            int j=i-1;
            while(j>=0 && a[j]>k)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }

        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
