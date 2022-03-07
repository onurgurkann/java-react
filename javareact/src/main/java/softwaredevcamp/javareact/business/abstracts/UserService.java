package softwaredevcamp.javareact.business.abstracts;

import softwaredevcamp.javareact.core.entities.User;
import softwaredevcamp.javareact.core.utilities.results.DataResult;
import softwaredevcamp.javareact.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
