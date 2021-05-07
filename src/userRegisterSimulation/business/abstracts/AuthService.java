package userRegisterSimulation.business.abstracts;

import userRegisterSimulation.entities.concretes.User;

public interface AuthService {
	
	void login(User user);
	void register(User user);
}
