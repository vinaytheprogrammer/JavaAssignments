public class Tenth {

    public static void main(String args[])
    {
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);
        double d=Math.pow(b, 2)-4*a*c;
        if(d>=0)
        {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("roots are : "+r1+ " and "+r2);
        }
        else
        {
            double r1=(-b+Math.sqrt(-d))/(2*a);
            double r2=(-b-Math.sqrt(-d))/(2*a);
            System.out.println("roots are : "+r1+ "i and "+r2+"i");
        }

    }
    
}
