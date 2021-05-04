package polymorphism;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {
				new DataBaseLogger(),new EmailLogger(), new FileLogger()
		};
		for(BaseLogger logger : loggers) {
			logger.log("Log mesajý");
		}
		
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.Add();

	}

}
