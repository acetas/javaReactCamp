package work7.Concrete;

import work7.Abstract.BaseCustomerManager;
import work7.Abstract.CustomerCheckService;
import work7.Abstract.CustomerService;
import work7.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager (CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	//private CustomerCheckManager customerCheckManager = new CustomerCheckManager();
	
	@Override
	public void add(Customer customer) {		
				
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks Customer added.");
		}else {
			System.out.println("Error! " + customer.getFirstName() + " is not a valid person");
		}
		
		
		
	}

}
