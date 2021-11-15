package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import core.abstracts.SignUpService;
import core.abstracts.Verify;
import core.concretes.Utils;
import dataAccess.abstracts.UserDao;
import entities.concretes.PersonalUser;

public class PersonalUserManager extends UserManager {

	private UserDao userDao;
	private Verify[] verifies;
	
	public PersonalUserManager(UserDao userDao, Verify[] verifies) {
		super();
		this.userDao = userDao;
		this.verifies = verifies;
	}
	
	
	String regex = "^(.+)@(.+)\\.(.+)$"; 
	Pattern pattern = Pattern.compile(regex);
	
	List<String> checkListEmails = new ArrayList<String>();
	
	public void add(PersonalUser personalUser) {
		
		if(personalUser.getPassword().length() < 6) {
			System.out.println("Parolan�z 6 karakterden az olamaz!");
			return;
		}else if(pattern.matcher(personalUser.getEmail()).matches() == false) {
			System.out.println("Ge�erli bir e-posta adresi yaz�n�z");
			return;
		}else if(checkListEmails.contains(personalUser.getEmail())) {
			System.out.println("Bu e-posta daha �nce kullan�lm��");
			return;
		}else if(personalUser.getFirstName().length() < 2) {
			System.out.println("Ad�n�z 2 karakterden az olamaz!");
			return;
		}else if(personalUser.getLastName().length() < 2) {
			System.out.println("Soyad�n�z 2 karakterden az olamaz!");
			return;
		}
		checkListEmails.add(personalUser.getEmail());
		userDao.add(personalUser);
		Utils.runVerify(verifies, personalUser);
	}
	
	public void add(PersonalUser personalUser, SignUpService signUpService) {
		signUpService.signUp("Google ile gelen " + personalUser.getFirstName() + " isimli ");
		userDao.add(personalUser);
	}
	
	public void update(PersonalUser personalUser) {
		//TODO
	}

}
