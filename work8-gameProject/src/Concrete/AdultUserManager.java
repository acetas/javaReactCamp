package Concrete;

import Abstract.UserCheckService;
import Abstract.UserManager;
import Entities.User;

public class AdultUserManager extends UserManager {

	private UserCheckService userCheckService;
	
	public AdultUserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi.");
		}else {
			System.out.println("Invalid Person");
		}
	}
	
	
	
}
