package userRegisterSimulation.business.concretes;

import userRegisterSimulation.business.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void sendMail(String mail) {
		System.out.println("Doðrulama maili gönderildi: " + mail);
		
	}

	@Override
	public boolean verifyMail() {
		
		System.out.println("Kullanýcý doðrulandý");
		return true;
	}

}
