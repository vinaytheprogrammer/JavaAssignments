
public class Third {

    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        if(n==1)
            System.out.println(n);
        if(n==2)
            System.out.println("1 1");
        else
        {
            System.out.print("1 1 ");
            n-=2;
            int a=1;
            int b=1;
            while(n>0)
            {
                int x=a+b;
                String s=" \n";
                System.out.print(x+""+(s.charAt((n==1)?1:0)));
                a=b;
                b=x;
                n--;
            }

        }
    }
    
}
