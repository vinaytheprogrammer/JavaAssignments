package Javat.assignment1;

public class Fifth {
    public static void main(String args[])
    {
        String s=args[0];
        int l=s.length();
        int i=0,j=l-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("Not pallindrome");
                return ;
            }
            i++;j--;
        }
        System.out.println("Is pallindrom!");
    }
}
