package Entities;

public class PremiumMembership {
	
	private int id;
	private String membershipType;
	private int unitPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int price) {
		this.unitPrice = price;
	}
	
}
