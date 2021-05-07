package userRegisterSimulation.googleAuth;

import userRegisterSimulation.entities.concretes.User;

public class GoogleAuthManager {
	public void login(User user) {
		System.out.println("google hesabý ile giriþ yapýldý: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void register(User user) {
		System.out.println("google hesabý ile kayýt yapýldý: " + user.getFirstName() + " " + user.getLastName());
	}
}
