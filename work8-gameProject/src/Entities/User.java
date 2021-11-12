package Entities;

public class User {
	
	private int id;
	private String TcIdentity;
	private String firstName;
	private String lastName;
	private int dateOfBirthYear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcIdentity() {
		return TcIdentity;
	}
	public void setTcIdentity(String tcIdentity) {
		TcIdentity = tcIdentity;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}
	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
	
}
