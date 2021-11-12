
import Abstract.UserManager;
import Adapters.MernisServiceAdapter;
import Concrete.AdultUserManager;
import Entities.AdultUser;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager customerManager = new AdultUserManager(new MernisServiceAdapter());
		
		User user = new AdultUser();
		user.setId(1);
		user.setTcIdentity("19954439194");
		user.setFirstName("Ahmet");
		user.setLastName("Çetintaþ");
		user.setDateOfBirthYear(1987);
		
		customerManager.add(user);
				
	}

}
