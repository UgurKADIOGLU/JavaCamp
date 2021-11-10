package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Uður");
		customer.setLastName("Kadýoðlu");
		customer.setId(1);
		Logger[] logger= {new SmsLogger(),new EmailLogger(),new DataBAseLogger()};
		CustomerManager customerManager = new CustomerManager(logger)  ;
		customerManager.delete(customer);

	}

}
