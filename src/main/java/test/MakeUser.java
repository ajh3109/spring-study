package test;

public class MakeUser {

	public static void main(String[] args) {
		UserManager um = new UserManager();
		
		User user = new User();
		user.setUserId("ajh3109");
		user.setUserName("ajh");
		
		um.setUser(user);
				
	}
}
