import java.lang.reflect.Array;

public class Main {

    static void divByZero() {
        int a = 1 / 0;
    }

    public static void main(String[] args) {

        int a[]=new int[3];
        try {
            
            a[4]=5;
            divByZero();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bound");
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
        }

    }
}