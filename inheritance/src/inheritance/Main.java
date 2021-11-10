package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ahmet = new IndividualCustomer();
		ahmet.setId(1);
		ahmet.setCustomerNumber("A1");
		ahmet.setFirstName("Ahmet");
		ahmet.setLastName("Çetintaþ");
		ahmet.setNationalIdendity("1000000");
		
		CorporateCustomer hepsiBurada =  new CorporateCustomer();
		hepsiBurada.setId(2);
		hepsiBurada.setCustomerNumber("T2");
		hepsiBurada.setCompanyName("HepsiBurada");
		hepsiBurada.setTaxNumber("40000040000");
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.setId(3);
		abc.setCustomerNumber("S3");
		abc.setSendikaSicil("4004");
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(ahmet); //polymorphism
		//customerManager.add(hepsiBurada); //polymorphism
		//customerManager.add(abc); //polymorphism
		
		Customer[] customers = {ahmet, hepsiBurada, abc};
		
		customerManager.addMultiple(customers);
		
	}

}
