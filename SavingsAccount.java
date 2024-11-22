
public class SavingsAccount extends BankAccount{

	private double rate = .025;
	private int savingsNumber;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		deposit(getBalance() * rate / 12);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
