package polymorphism;

public class CustomerManager {

	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void Add() {
		System.out.println("M��teri eklendi.");
		this.logger.log("Log mesaj�");
		
	}
}
