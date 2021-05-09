package throwDemo;

public class AccountManager {
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) throws BalanceInsuffientException {
		if(balance>=amount) {
			balance = getBalance() - amount;
			}
		else {
			throw new BalanceInsuffientException("Yetersiz bakiye");
		}
		
	}

}
