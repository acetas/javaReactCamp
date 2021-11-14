package Concrete;

import Abstract.UserManager;
import Entities.User;

public class KidsUserManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi.");
	}

}
