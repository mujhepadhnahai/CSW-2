public class Bank{
    public void initiate(){
        ATM atm = new ATM();
        try {
            atm.input();
            atm.verify();
        } catch (Exception a) {
           try {
            atm.input();
            atm.verify();
           } catch (Exception b) {
            try {
                atm.input();
                atm.verify();
            }catch(Exception c){
                System.out.println("Card Blocked");
                System.out.exit(0);
            }
           }
        }
    }
}