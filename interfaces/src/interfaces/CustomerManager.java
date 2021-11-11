package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly coupled (gevþek baðlý) - tightly coupled (sýký baðlý)
	public void add(Customer customer) {
		System.out.println("Customer added: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName() + " added is logged");
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName() + " deleted is logged");
	}
}
