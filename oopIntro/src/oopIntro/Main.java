package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lonova14",14000,"16 gm ram",10,13500);


		Product product2 = new Product();
		product2.setId(1);
		product2.setName("Lenova 15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());

		Product product3 = new Product();
		ProductManager productmanager=new ProductManager();
		productmanager.addToCart(product2);
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("U?ur");
		System.out.println(category1.getName());

		

		
		
		
	}

}
