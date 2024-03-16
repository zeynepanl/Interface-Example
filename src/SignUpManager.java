
public class SignUpManager {
	
	private IUserCheckServis iUserCheckServis;

	public SignUpManager(IUserCheckServis iUserCheckServis) {
		this.iUserCheckServis = iUserCheckServis;
	}
	
	public void signUp(User user) {
		
		if(iUserCheckServis.checkUser(user)) {
			System.out.println("Kullanıcı kayıt oldu"+user.getName());
		}
		else {
			System.out.println("Kullanıcı kayıt olamadı");
		}
	}
	
	
}
	
	

	
