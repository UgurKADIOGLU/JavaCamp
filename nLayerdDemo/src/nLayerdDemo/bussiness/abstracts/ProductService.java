package nLayerdDemo.bussiness.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductService {
	public void add(Product product);
	List<Product> getAll();
}
