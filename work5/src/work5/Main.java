package work5;

public class Main {

	public static void main(String[] args) {
		Student ahmet = new Student();
		ahmet.setId(1);
		ahmet.setFirstName("Ahmet");
		ahmet.setLastName("Çetintaþ");
		ahmet.setWhishList(new String[]{"JAVA","JavaScript","React"});
		
		Student mehmet = new Student();
		mehmet.setId(2);
		mehmet.setFirstName("Mehmet");
		mehmet.setLastName("Er");
		mehmet.setWhishList(new String[]{"JAVA","JavaScript"});
		
		Student ali = new Student();
		ali.setId(3);
		ali.setFirstName("Ali");
		ali.setLastName("Veli");
		ali.setWhishList(new String[]{"JavaScript"});
		
		Instructor engin = new Instructor();
		engin.setId(4);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroð");
		engin.setCourses(new String[]{"JAVA","React","C#","AngularJS"});
		
		StudentManager student = new StudentManager();
		Student[] students = {ahmet, ali, mehmet};
		
		student.addMultiple(students);
		
		System.out.println("----------------");
		
		InstructorManager instructor = new InstructorManager();
		instructor.add(engin);

	}

}
