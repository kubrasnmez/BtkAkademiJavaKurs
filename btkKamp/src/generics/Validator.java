package generics;

public class Validator {
	public <T extends Entity> void validate(T entity) {
		Validator validator = new Validator();
		Customer customer = new Customer();
		validator.validate(customer);
	}
}
