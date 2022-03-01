package softwaredevcamp.javareact.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import softwaredevcamp.javareact.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{ // -> Table(Product) and Data Type(Integer)
	Product getByProductName(String productName);
	// select * from products where product_name = productName
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	// select * from products where category_id in(1,2,3)
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	// jpql
	@Query("From Product where productName=:productName and category.categoryId=:categoryId") // Product class 
	List<Product> getByNameAndCategory(String productName, int categoryId);
	// select * from products where product_name = xxx and categoryId = xxx
	
}
