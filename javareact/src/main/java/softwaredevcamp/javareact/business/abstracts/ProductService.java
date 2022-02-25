package softwaredevcamp.javareact.business.abstracts;

import java.util.List;
import softwaredevcamp.javareact.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
