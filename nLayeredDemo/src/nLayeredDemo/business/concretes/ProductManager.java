package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	//Dependency Injection
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Cannot be added to this category");
			return;
		}
		
		this.productDao.add(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
