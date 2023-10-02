public class loop {
    public static void main(String args[])
    {
        int intArray[]=new int[]{1,2,3,4,5};         //Static Array
        System.out.println("Elements less than 3 are: ");

        for(int i=0;i<intArray.length;i++)
        {
            if(intArray[i]==3)
            {
                break;
                
            }
            else
            {
                System.out.println(intArray[i]);
            }
        }
    }
    
}
