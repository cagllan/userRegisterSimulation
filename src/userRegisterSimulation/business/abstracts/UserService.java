package userRegisterSimulation.business.abstracts;

import java.util.List;

import userRegisterSimulation.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
}
