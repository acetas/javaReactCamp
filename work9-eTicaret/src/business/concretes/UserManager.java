package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import entities.concretes.User;

public class UserManager implements UserService {
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ baþarýlý");
		
	}
	
}
