package in.ashokit;

public class EmailServiceImpl implements IEmailService{

	public boolean sendEmail(String subject,int pwd) {
		System.out.println("Email Sent...");		
		return true;
	}

}
