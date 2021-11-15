package core.concretes;

import core.abstracts.SignUpService;
import googleLogin.Login;

public class GoogleSignUpAdapter implements SignUpService {

	@Override
	public void signUp(String message) {
		Login login = new Login();
		login.login(message);
		
	}

}
