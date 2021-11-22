package kodlamaio.northwindssss.bussiness.concreteis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwindssss.bussiness.abstracts.ProductService;
import kodlamaio.northwindssss.dataaccess.abstracts.ProductDao;
import kodlamaio.northwindssss.entities.concreteis.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
