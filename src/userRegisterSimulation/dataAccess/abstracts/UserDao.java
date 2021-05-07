package userRegisterSimulation.dataAccess.abstracts;

import java.util.List;

import userRegisterSimulation.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll();
}
