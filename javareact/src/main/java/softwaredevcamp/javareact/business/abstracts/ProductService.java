package softwaredevcamp.javareact.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import softwaredevcamp.javareact.core.utilities.results.DataResult;
import softwaredevcamp.javareact.core.utilities.results.Result;
import softwaredevcamp.javareact.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAllSorted(); // Sorting
	DataResult<List<Product>> getAll(int pageNo, int pageSize); //Pagination
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	// select * from products where product_name = productName
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	// select * from products where category_id in(1,2,3)
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
}
