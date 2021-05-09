package throwDemo;

public class BalanceInsuffientException extends Exception {
	String message;
	public BalanceInsuffientException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
	

}
