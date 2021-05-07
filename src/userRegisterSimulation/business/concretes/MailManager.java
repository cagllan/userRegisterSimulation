package userRegisterSimulation.business.concretes;

import userRegisterSimulation.business.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void sendMail(String mail) {
		System.out.println("Do�rulama maili g�nderildi: " + mail);
		
	}

	@Override
	public boolean verifyMail() {
		
		System.out.println("Kullan�c� do�ruland�");
		return true;
	}

}
