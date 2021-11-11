package interfaces;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(
				new Logger[]{new SmsLogger(), new EmailLogger(), new FileLogger()});
		
		Customer ahmet = new Customer(1, "Ahmet", "Çetintaþ");
		
		customerManager.add(ahmet);

	}

}
