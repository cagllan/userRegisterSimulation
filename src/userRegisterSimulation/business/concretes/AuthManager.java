package userRegisterSimulation.business.concretes;

import userRegisterSimulation.business.abstracts.AuthService;
import userRegisterSimulation.business.abstracts.MailService;
import userRegisterSimulation.business.abstracts.UserService;
import userRegisterSimulation.entities.concretes.User;

public class AuthManager implements AuthService{
	private UserService userService;
	private MailService mailService;

	public AuthManager(UserService userService, MailService mailService) {
		this.userService = userService;
		this.mailService = mailService;
	}

	@Override
	public void login(User user) {
		
		
		
		
		if(!checkMail(user.getEmail())) {
			System.out.println("Email hatalý");
		}
		
		if(!checkPassword(user.getPassword())) {
			System.out.println("þifre hatalý");
		}
		
		if(checkMail(user.getEmail()) && checkPassword(user.getPassword())) {
			System.out.println("Sisteme giriþ yaptý: " + user.getFirstName() + " " + user.getLastName());
		}
		
	}

	@Override
	public void register(User user) {
		
		mailService.sendMail(user.getEmail());
		
		if(mailService.verifyMail()) {
			this.userService.add(user);
		}else {
			System.out.println("Kullanýcý doðrulanmadý kayýt baþarýsýz.");
		}
		
		
	}
	
	
	private boolean checkMail(String email) {
		
		for (User user : this.userService.getAll()) {
			
			if(user.getEmail() == email) {
				return true;
			}
			
		}
		
		return false;
	}
	
	private boolean checkPassword(String password) {
		for (User user : this.userService.getAll()) {
			
			if(user.getPassword() == password) {
				return true;
			}
			
		}
		
		return false;
	}
	
	
}
