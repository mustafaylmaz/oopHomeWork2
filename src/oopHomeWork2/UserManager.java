package oopHomeWork2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " added");
		
	}
	 
	public void delete(User user) {
		System.out.println(user.getFirstName() + " deleted");
		
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " updated");
		
	}
	
	public void get(User user) {
		
		System.out.println(user.getFirstName() + " listed");
		
	}
	
	public void getAll() {
		System.out.println("All user listed");
	}
}
