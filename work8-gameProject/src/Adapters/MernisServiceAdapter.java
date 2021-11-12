package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	public boolean result;
	
	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return result = client.TCKimlikNoDogrula(Long.parseLong(user.getTcIdentity()),
			user.getFirstName(),
			user.getLastName(),
			user.getDateOfBirthYear());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}
	

}
