package work5;

public class StudentManager extends BaseUserManager{
	public void add(User user) {
		System.out.println("User Added: " + user.getFirstName() + " " + user.getLastName());
		System.out.println(user.getUserName());
		//System.out.println("Wishlist:");
		//for (String wish : user.getWhishList()) {
		//	System.out.println(wish);
		//}
	}
	//bulk insert
	public void addMultiple(User[] students) {
		for (User student : students) {
			add(student);
		}
	}
}
