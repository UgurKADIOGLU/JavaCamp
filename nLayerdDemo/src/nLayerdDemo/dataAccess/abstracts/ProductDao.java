package nLayerdDemo.dataAccess.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductDao {
 public void add(Product product);
 public void update(Product product);
 public void delete(Product product);
 Product get(int id);
 List<Product> getAll();
 
}
