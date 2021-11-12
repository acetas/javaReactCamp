package work7.Abstract;

import work7.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Db yazýldý: " + customer.getFirstName());
		
	}

}
