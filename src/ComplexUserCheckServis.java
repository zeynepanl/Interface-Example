
public class ComplexUserCheckServis implements IUserCheckServis {

	public boolean checkUser(User user) {
		
			if(user.getAge() >=18 && user.getName().startsWith("Mu")) {
				return true;
			}

			return false;
	}
	

}
