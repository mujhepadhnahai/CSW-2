import java.util.*;
public class ATM{
   int acc = 4646;
   int acc_no;
   int password = 4646;
   int pw;
   public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your account number:");
    acc_no = sc.nextInt();
    System.out.println("Enter your password:");
    pw = sc.nextInt();
   }
   public void verify() throws Exception{
     if(acc==acc_no && password == pw){
        System.out.println("Welcome to your account");
     }else{
        InvalidCustomerException ice = new InvalidCustomerException();
        System.out.println(ice.message());
        throw ice;
     }

   }
}