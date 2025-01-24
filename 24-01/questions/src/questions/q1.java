package questions;

class Account{
	private int acc_no;
	private String name;
	private String email;
	private int amount;
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

public class q1 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAcc_no(001);
		a1.setAmount(1000);
		a1.setEmail("guruprasadpanda@gmail.com");
		a1.setName("Guru Prasad Panda");
		
		System.out.println("Thanks for creating you account in PNB");
		System.out.println("Account holder details");
		System.out.println("Name: "+a1.getName());
		System.out.println("Email: "+a1.getEmail());
		System.out.println("Account no: "+a1.getEmail());
		System.out.println("Amount left: "+a1.getAmount());
	}

}
