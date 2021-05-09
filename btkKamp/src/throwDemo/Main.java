package throwDemo;

public class Main {

	public static void main(String[] args) throws Exception {
		AccountManager accountManager = new AccountManager();
		System.out.println("Hesap : " + accountManager.getBalance());
		
		accountManager.deposit(100);
		System.out.println("Hesap : " + accountManager.getBalance());
		
		accountManager.withdraw(90);
		System.out.println("Hesap : " + accountManager.getBalance());
		
		accountManager.withdraw(20);
		System.out.println("Hesap : " + accountManager.getBalance());

	}

}
