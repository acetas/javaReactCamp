package core.concretes;

import core.abstracts.Verify;
import entities.concretes.User;

public class EmailVerify implements Verify {

	public void verify(User user) {
		System.out.println(user.getEmail() + " adresine doðrulama baðlantýsý gönderildi.");
		
	}

	public void isEmailVerify(User user) {
		System.out.println(user.getEmail() + " eposta adresi doðrulandý.");
		
	}
	
}
