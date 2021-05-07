package userRegisterSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import userRegisterSimulation.dataAccess.abstracts.UserDao;
import userRegisterSimulation.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users;
	
	public InMemoryUserDao() {
		this.users = new ArrayList<User>();		
		
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		
	}
	
	@Override
	public void update(User user) {
		
		for(User updatedUser:users) {
			if(updatedUser.getId() == user.getId()) {
				updatedUser.setFirstName(user.getFirstName());
				updatedUser.setLastName(user.getLastName());
				updatedUser.setEmail(user.getEmail());
				updatedUser.setPassword(user.getPassword());
			}
		}
	}

	@Override
	public void delete(User user) {
		
		Iterator<User> iterator = users.iterator();

		while (iterator.hasNext()) {
		    User deletedUser = iterator.next();

		    if (deletedUser.getId() == user.getId())
		        iterator.remove();
		}

	}
	

	@Override
	public User get(int id) {
		User getUser = null;
		for(User user:users) {
			if(user.getId() == id) {
				getUser = user;
			}
		}
		return getUser;
	}
	
	@Override
	public List<User> getAll() {
		
		return users;
	}
}
