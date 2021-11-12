package work7;

import work7.Abstract.BaseCustomerManager;
import work7.Adapters.MernisServiceAdapter;
import work7.Concrete.CustomerCheckManager;
import work7.Concrete.NeroCustomerManager;
import work7.Concrete.StarbucksCustomerManager;
import work7.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Ahmet");
		customer.setLastName("Çetintaþ");
		customer.setNationalityId("19962453164");
		customer.setDateOfBirth(1987);
				
		customerManager.add(customer);
		
	}

}
