
public class AgeuserCheckServis implements IUserCheckServis{

	public boolean checkUser(User user) {
			if(user.getAge() >= 18) {
				return true;
			}
			return false;
	}
	
}
