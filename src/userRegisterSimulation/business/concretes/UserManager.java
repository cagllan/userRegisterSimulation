package userRegisterSimulation.business.concretes;

import java.util.List;

import userRegisterSimulation.business.abstracts.UserService;
import userRegisterSimulation.core.utils.Validation;
import userRegisterSimulation.dataAccess.abstracts.UserDao;
import userRegisterSimulation.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	

	@Override
	public void add(User user) {
		
		if(minCharacterLength(2, user.getFirstName())) {
			System.out.println("isim 2 karakterden küçük olamaz");
			return;
		}
		
		if(minCharacterLength(2, user.getLastName())) {
			System.out.println("soyad 2 karakterden küçük olamaz");
			return;
		}
		
		if(isEmailExists(user.getEmail())) {
			System.out.println("email var");
			return;
		}
		
		
		
		if(!Validation.validateEmail(user.getEmail())) {
			System.out.println("geçersiz email");
			return;
		}
		
		
		
		if(minCharacterLength(6,user.getPassword())){			
			System.out.println("þifre 6 karakterden küçük olamaz");
			return;
		}
		
		this.userDao.add(user);
		System.out.println("Kayýt yapýldý: " + user.getFirstName() + " " + user.getLastName());
		
	}
	
	
	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public User get(int id) {
		return this.userDao.get(id);
	}
	
	
	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
	
	
private boolean minPasswordLength(String password) {
		
		if(password.length() < 6) {
			return true;
		}
		
		return false;
	}
	
	private boolean isEmailExists(String email) {
		
		for (User user : getAll()) {
			
			if(user.getEmail() == email) {
				return true;
			}
			
		}
		
		return false;
	}
	
	
	private boolean minCharacterLength(int min, String item) {
		
		if(item.length() < min) {
			return true;
		}
		
		return false;
	}
	
}
