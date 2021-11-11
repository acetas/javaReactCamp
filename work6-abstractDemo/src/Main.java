
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatebaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}
