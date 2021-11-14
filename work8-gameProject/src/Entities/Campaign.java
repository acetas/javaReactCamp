package Entities;

public class Campaign {
	
	private int id;
	private String name;
	private int percent;
	private int newUnitPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public int getNewUnitPrice(PremiumMembership premiumMembership) {
		newUnitPrice = premiumMembership.getUnitPrice() - (premiumMembership.getUnitPrice() * (percent / 100));
		return newUnitPrice;
	}
	
}
