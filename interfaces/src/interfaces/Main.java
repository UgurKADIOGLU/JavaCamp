package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Uður");
		customer.setLastName("Kadýoðlu");
		customer.setId(1);
		CustomerManager customerManager = new CustomerManager(new SmsLogger());
		customerManager.add(customer);

	}

}
