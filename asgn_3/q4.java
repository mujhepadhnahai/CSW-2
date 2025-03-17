
import java.util.*;
public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        try {
            double sqRoot = calculate(n);
            System.out.println("Square root of " + n + " is " + sqRoot);

        } catch (ArithmeticException e ) {
            System.err.println(e.getMessage());
        }
    }
    public static double calculate (int num) throws ArithmeticException{
        if (num < 0) {
            throw new ArithmeticException("Square root of negative number is not possible");
        }
        double sq = Math.sqrt(num);
        if(sq != (int) sq){
            throw new ArithmeticException("Square root of " + num + " is not an integer");
            
        }
        return sq;
    }
}