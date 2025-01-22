package calculatorApp;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		Calculator call = new Calculator ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for calculation");
		int a  = sc.nextInt();
		int b = sc.nextInt();
		char p = 'y';
		while(p=='y' || p =='Y') {
		System.out.println("Enter 1 for addition, 2 for substraction , 3 for multiplication , 4 for division");
        int c = sc.nextInt();
        switch(c){
        case 1 : call.add(a,b);break;
        case 2 : call.sub(a,b);break;
        case 3 : call.multi(a,b);break;
        case 4 : call.div(a,b);break;
        default : System.out.println("invalid input");
        }
        call.result();
        System.out.print("enter y if you want to perfprm more calculation");
        p = sc.next().charAt(0);
		}
	}
}
