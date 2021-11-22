package kodlamaio.northwindssss.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwindssss.entities.concreteis.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
