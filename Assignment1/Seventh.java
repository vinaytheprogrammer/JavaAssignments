import java.util.Scanner;

public class Seventh {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int num=0;
        int j=0;
        // System.out.println(s);
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)!='0'&& s.charAt(i)!='1' )
            {
                System.out.println("Input is not in proper format");
                return;
            }
            // num+=(s.charAt(i)-'0')*Math.pow(2, j);
            // j++;
        }
        num=Integer.parseInt(s,2);
        System.out.println("The binary number is : "+num);
    }
    
}
