
// package assignment 1;
import java.util.Scanner;

public class Ninth {

    public static void main(String args[]) {
        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);
        Scanner sc = new Scanner(System.in);
        String op = sc.next();
        double x=0;
        switch (op) {
            case "+":
                x = d1 + d2;
                break;
            case "-":
                x = d1 - d2;
                break;
            case "/":
                x = d1 / d2;
                break;
            case "*":
                x = d1 * d2;
                break;
            case "%":
                x = d1 % d2;
                break;
            default:
                System.out.println("Invalid option");
        }
        System.out.println(x);

    }

}
