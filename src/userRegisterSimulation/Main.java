package userRegisterSimulation;

import userRegisterSimulation.business.abstracts.AuthService;
import userRegisterSimulation.business.abstracts.UserService;
import userRegisterSimulation.business.concretes.AuthManager;
import userRegisterSimulation.business.concretes.MailManager;
import userRegisterSimulation.business.concretes.UserManager;
import userRegisterSimulation.dataAccess.concretes.InMemoryUserDao;
import userRegisterSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"akira","yamaoka","silenthillost@gmail.com","123456");
		User user2 = new User(2,"son","goku","songoku@gmail.com","123456");

		
		UserService userManager = new UserManager(new InMemoryUserDao());
	
		AuthService authManager = new AuthManager(userManager, new MailManager());
		
		authManager.register(user1);
		authManager.register(user2);

		
		System.out.println("--------------------");
		
		for (User user : userManager.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		
		System.out.println("--------------------");
		
		authManager.login(user1);
	}

}
