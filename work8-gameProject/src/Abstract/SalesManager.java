package Abstract;

import Entities.Campaign;
import Entities.PremiumMembership;
import Entities.User;

public class SalesManager {
		
	private User user;
	
	public SalesManager(User user) {
		this.user = user;
	}
	
	public void buy(PremiumMembership premiumMembership) {
		System.out.println(user.getFirstName() + " bought " + premiumMembership.getMembershipType());
	}
	
	public void buy(PremiumMembership premiumMembership, Campaign campaign) {
		System.out.println(user.getFirstName() + " bought " + premiumMembership.getMembershipType() + " via " + campaign.getName());
	}
	
	
}
