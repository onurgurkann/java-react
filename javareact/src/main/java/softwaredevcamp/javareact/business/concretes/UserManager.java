package softwaredevcamp.javareact.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import softwaredevcamp.javareact.business.abstracts.UserService;
import softwaredevcamp.javareact.core.dataAccess.UserDao;
import softwaredevcamp.javareact.core.entities.User;
import softwaredevcamp.javareact.core.utilities.results.DataResult;
import softwaredevcamp.javareact.core.utilities.results.Result;
import softwaredevcamp.javareact.core.utilities.results.SuccessDataResult;
import softwaredevcamp.javareact.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Data added");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"User found");
	}

}
