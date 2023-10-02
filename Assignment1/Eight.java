
import java.util.Scanner;

public class Eight
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=0;
        int a[]=new int[26];
        for(int i=0;i<26;i++)
            a[i]=0;
        for(int i=0;i<s.length();i++)
        {
            if(++a[s.charAt(i)-'a']>max)
                max=a[s.charAt(i)-'a'];
        }
        while(max>0)
        {
            for(int i=0;i<26;i++)
            {
                if(a[i]==max)
                {
                    char ch=(char)('a'+i);
                    System.out.println(ch + " : "+max);
                }        
            }
            max--;
        }
        
    }
}