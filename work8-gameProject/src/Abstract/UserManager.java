package Abstract;

import Entities.User;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " is updated.");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " is removed.");
	}
}
