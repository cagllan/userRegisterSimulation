package userRegisterSimulation.core.adapter;

import userRegisterSimulation.business.abstracts.AuthService;
import userRegisterSimulation.entities.concretes.User;
import userRegisterSimulation.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{
	public void login(User user) {
		GoogleAuthManager accountManager = new GoogleAuthManager();
		accountManager.login(user);
		
	}

	@Override
	public void register(User user) {
		GoogleAuthManager accountManager = new GoogleAuthManager();
		accountManager.register(user);
		
	}
}
