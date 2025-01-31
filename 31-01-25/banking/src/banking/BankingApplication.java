package banking;
public class BankingApplication {

	public static void main(String[] args) {
		System.out.println("Saving Account Transaction");
		System.out.println("==========================");
		depositeToAccount(SavingAccount,500);
		withdrawFromAccount(SavingAccount,200);
		System.out.println();
		
		System.out.println("Current Account Transaction");
		System.out.println("==========================");
		depositeToAccount(CurrentAccount,1000);
		withdrawFromAccount(CurrentAccount,355);
		System.out.println();
		
		System.out.println("Remaing Balances");
		System.out.println("================");
		displayAccountBalance(SavingAccount);
		displayAccountBalance(CurrentAccount);
	}
	public static void depositeToAccount(Account account,double amount) {
		account.deposit(amount);
	}
	public static void withdrawFromAccount(Account account,double amount) {
		account.withdraw(amount);
	}
	public static void displayAccountBalance(Account account) {
		account.displayAccountInfo();
		System.out.println();
	}
}
