package inheritance;

public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;
	private String nationalIdendity;
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
	public String getNationalIdendity() {
		return nationalIdendity;
	}
	public void setNationalIdendity(String nationalIdendity) {
		this.nationalIdendity = nationalIdendity;
	}
}
