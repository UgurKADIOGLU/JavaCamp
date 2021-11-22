package kodlamaio.northwind.bussines.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concrets.Product;

public interface ProductService {
	List<Product> getAll();
}
