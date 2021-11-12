package Abstract;

import Entities.User;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi.");
	}
}
