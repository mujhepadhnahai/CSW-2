import java.util.*;
public class q9{
    public static int readIntegerFromUser(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.println("enter a no: ");
                n = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();                       
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n = readIntegerFromUser();
        System.out.println("you entered " + n);
    }
}