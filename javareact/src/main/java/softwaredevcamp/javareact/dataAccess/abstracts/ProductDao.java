package softwaredevcamp.javareact.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import softwaredevcamp.javareact.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{ // -> Table(Product) and Dataype(Integer)
	
}
