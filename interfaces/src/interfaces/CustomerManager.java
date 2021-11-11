package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly coupled (gev�ek ba�l�) - tightly coupled (s�k� ba�l�)
	public void add(Customer customer) {
		System.out.println("Customer added: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName() + " added is logged");
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName() + " deleted is logged");
	}
}
