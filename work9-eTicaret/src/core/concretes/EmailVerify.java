package core.concretes;

import core.abstracts.Verify;
import entities.concretes.User;

public class EmailVerify implements Verify {

	public void verify(User user) {
		System.out.println(user.getEmail() + " adresine do�rulama ba�lant�s� g�nderildi.");
		
	}

	public void isEmailVerify(User user) {
		System.out.println(user.getEmail() + " eposta adresi do�ruland�.");
		
	}
	
}
