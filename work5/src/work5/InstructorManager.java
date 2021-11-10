package work5;

public class InstructorManager extends BaseUserManager {
	public void add(Instructor user) {
		System.out.println("Instructor Added: " + user.getFirstName() + " " + user.getLastName());
		System.out.println(user.getUserName());
		//System.out.println("Courses:");
		//for (String course : user.getCourses()) {
		//	System.out.println(course);
		//}
	}
	//bulk insert
	public void addMultiple(Instructor[] users) {
		for (Instructor user : users) {
			add(user);
		}
	}
}
