package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("U�ur");
		customer.setLastName("Kad�o�lu");
		customer.setId(1);
		Logger[] logger= {new SmsLogger(),new EmailLogger(),new DataBAseLogger()};
		CustomerManager customerManager = new CustomerManager(logger)  ;
		customerManager.delete(customer);

	}

}
