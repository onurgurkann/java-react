package softwaredevcamp.javareact.business.abstracts;

import java.util.List;

import softwaredevcamp.javareact.core.utilities.results.DataResult;
import softwaredevcamp.javareact.core.utilities.results.Result;
import softwaredevcamp.javareact.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
