package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		// ToDo : will be resolved Spring IoC
		ProductService productService = new ProductManager(new HibernateProductDao());

		Product product = new Product(1, 2, "Apple", 12, 50);
		productService.add(product);
	}

}
