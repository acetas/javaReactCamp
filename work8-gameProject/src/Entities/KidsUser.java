package Entities;

public class KidsUser extends User {
	
	Boolean parentalConsent;

	public boolean getParentalConsent() {
		return parentalConsent;
	}
	public void setParentalConsent(Boolean parentalConsent) {
		this.parentalConsent = parentalConsent;
	}
	
}
