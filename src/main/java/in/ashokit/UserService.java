package in.ashokit;

public class UserService {
	private IPwdService pwdServ;
	private IEmailService emailServ;
	
	public UserService(IPwdService pwdServ, IEmailService emailServ) {
		this.pwdServ = pwdServ;
		this.emailServ = emailServ;
	}
	
	public void register() {
		int pwd = pwdServ.generatePassword();
		
		String str = "First Mail";
		boolean status = emailServ.sendEmail(str ,pwd);
		
		if(status) {
			System.out.println("Successfully Regestered !!!");
		}else {
			System.out.println("Trouble in Regestration");
		}
	}
}
