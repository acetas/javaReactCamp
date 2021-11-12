package work7.Concrete;

import work7.Abstract.BaseCustomerManager;
import work7.Abstract.CustomerService;
import work7.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Nero Customer added.");
		
	}
	
}
