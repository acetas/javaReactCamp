package core.concretes;

import core.abstracts.Verify;
import entities.concretes.User;

public class Utils {
	public static void runVerify(Verify[] verifies, User user) {
		for (Verify verify : verifies) {
			verify.verify(user);
		}
	}
}
