package softwaredevcamp.javareact.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import softwaredevcamp.javareact.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
