package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getId() + " id no'lu kullan�c� hibernate ile eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getId() + " id no'lu kullan�c� hibernate ile g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getId() + " id no'lu kullan�c� hibernate ile silindi.");
		
	}

}
