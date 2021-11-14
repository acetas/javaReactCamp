package Abstract;

import Entities.PremiumMembership;

public class PremiumMembershipManager {
	public void add(PremiumMembership premiumMemberships) {
		System.out.println("The unit price for " + premiumMemberships.getUnitPrice() + " added is " + premiumMemberships.getMembershipType());
	}
	
}
