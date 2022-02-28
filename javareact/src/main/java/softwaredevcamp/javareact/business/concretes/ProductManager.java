package softwaredevcamp.javareact.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softwaredevcamp.javareact.business.abstracts.ProductService;
import softwaredevcamp.javareact.core.utilities.results.DataResult;
import softwaredevcamp.javareact.core.utilities.results.Result;
import softwaredevcamp.javareact.core.utilities.results.SuccessDataResult;
import softwaredevcamp.javareact.core.utilities.results.SuccessResult;
import softwaredevcamp.javareact.dataAccess.abstracts.ProductDao;
import softwaredevcamp.javareact.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listed");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product); // add
		return new SuccessResult("Product added");
	}

}
