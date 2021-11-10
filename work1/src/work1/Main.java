package work1;

public class Main {

	public static void main(String[] args) {
		
		Educator educator1 = new Educator(1, "Engin Demirog");
		Educator educator2 = new Educator();
		educator2.id = 2;
		educator2.name = "Ahmet Çetintaþ";
		
		Educator[] educators = {educator1,educator2};
		
		System.out.println("Educators:");
		for (Educator educator : educators) {
			System.out.println(educator.name);
		}
		System.out.println("----------------------------");

		Course course1 = new Course();
		course1.id = 1;
		course1.name = "JAVA";
		course1.status = 72;
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Javascript";
		course2.status = 32;
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name + " isimli kurs içerisinde ilerleme durumu %" + course.status);
		}
		System.out.println("----------------------------");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.courseStatus(course2);
		
	}

}
