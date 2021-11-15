
import business.concretes.PersonalUserManager;
import business.concretes.UserManager;
import core.abstracts.Verify;
import core.concretes.EmailVerify;
import core.concretes.GoogleSignUpAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.PersonalUser;

public class Main {

	public static void main(String[] args) {
		PersonalUser ahmet = new PersonalUser();
		ahmet.setId(1);
		ahmet.setEmail("ahmetcetintas@outlook.com");
		ahmet.setPassword("123456");
		ahmet.setFirstName("Ahmet");
		ahmet.setLastName("Çetintaþ");
		
		PersonalUser mehmet = new PersonalUser();
		mehmet.setId(2);
		mehmet.setEmail("mehmet@gmail.com");
		mehmet.setPassword("321654");
		mehmet.setFirstName("Mehmet");
		mehmet.setLastName("Çetintaþ");
		
		PersonalUserManager personalUserManager = new PersonalUserManager(new HibernateUserDao(),new Verify[] {new EmailVerify()});
		personalUserManager.add(ahmet);
		personalUserManager.add(mehmet, new GoogleSignUpAdapter());
		
		UserManager userManager = new UserManager();
		userManager.login(mehmet);
		
		
	}

}
