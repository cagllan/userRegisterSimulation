package userRegisterSimulation.googleAuth;

import userRegisterSimulation.entities.concretes.User;

public class GoogleAuthManager {
	public void login(User user) {
		System.out.println("google hesab� ile giri� yap�ld�: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void register(User user) {
		System.out.println("google hesab� ile kay�t yap�ld�: " + user.getFirstName() + " " + user.getLastName());
	}
}
