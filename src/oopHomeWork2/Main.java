package oopHomeWork2;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("a user");
		
		
		UserManager userManager = new UserManager();
		userManager.get(user);

	}

}
