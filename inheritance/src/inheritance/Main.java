package inheritance;

public class Main {

	public static void main(String[] args) {
		individualCustomer ugur=new individualCustomer();
		ugur.customerNumber="123456789";
		
		
		corporateCustomer hepsiburada=new corporateCustomer();
		
		customerManager customerManager=new customerManager();
		customerManager.add(ugur);
		
		Customer[] customers= {ugur,hepsiburada};
		
		customerManager.addMultiple(customers);

	}

}
