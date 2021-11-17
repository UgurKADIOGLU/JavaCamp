package nLayerdDemo;

import nLayerdDemo.bussiness.abstracts.ProductService;
import nLayerdDemo.bussiness.concretes.ProductManager;
import nLayerdDemo.core.JloggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.abcProductDao;
import nLayerdDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService=new ProductManager(new abcProductDao(),new JloggerManagerAdapter());
		Product product=new Product(1,2,"Elma",12,50);
		productService.add(product);

	}

}
