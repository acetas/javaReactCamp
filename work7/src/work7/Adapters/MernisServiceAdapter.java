package work7.Adapters;

import work7.Abstract.CustomerCheckService;
import java.rmi.RemoteException;
import work7.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	
	public boolean result;
	@Override
	public boolean checkIfRealPerson(Customer customer){
		KPSPublicSoapProxy validate = new KPSPublicSoapProxy();
		try {
			return result = validate.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
							customer.getFirstName(), 
							customer.getLastName(),
							customer.getDateOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	

	

	
	
	
}
