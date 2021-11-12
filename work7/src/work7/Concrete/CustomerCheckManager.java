package work7.Concrete;

import work7.Abstract.CustomerCheckService;
import work7.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}



}