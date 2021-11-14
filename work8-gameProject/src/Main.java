
import Abstract.CampaignManager;

import Abstract.PremiumMembershipManager;
import Abstract.SalesManager;
import Abstract.UserManager;
import Adapters.MernisServiceAdapter;
import Concrete.AdultUserManager;
import Entities.AdultUser;
import Entities.Campaign;
import Entities.PremiumMembership;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager customerManager = new AdultUserManager(new MernisServiceAdapter());
		
		AdultUser user = new AdultUser();
		user.setId(1);
		user.setTcIdentity("19954439194");
		user.setFirstName("Ahmet");
		user.setLastName("Çetintaþ");
		user.setDateOfBirthYear(1987);
		user.setTaxNumber("46562425794");
		
		customerManager.add(user);
		customerManager.update(user);
		customerManager.remove(user);
		
		PremiumMembership platinumMembership = new PremiumMembership();
		platinumMembership.setId(1);
		platinumMembership.setMembershipType("Platinum Membership");
		platinumMembership.setUnitPrice(750);
		
		PremiumMembership silverMembership = new PremiumMembership();
		silverMembership.setId(2);
		silverMembership.setMembershipType("Silver Membership");
		silverMembership.setUnitPrice(1400);
		
		PremiumMembership goldMembership = new PremiumMembership();
		goldMembership.setId(3);
		goldMembership.setMembershipType("Gold Membership");
		goldMembership.setUnitPrice(1750);
		
		PremiumMembershipManager premiumMembershipManager = new PremiumMembershipManager();
		premiumMembershipManager.add(platinumMembership);
		premiumMembershipManager.add(silverMembership);
		premiumMembershipManager.add(goldMembership);
		
		SalesManager salesManager = new SalesManager(user);
		salesManager.buy(goldMembership);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Discount Campaign!");
		campaign.setPercent(15);
		campaign.getNewUnitPrice(goldMembership);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SalesManager salesManager2 = new SalesManager(user);
		salesManager2.buy(silverMembership, campaign);
		
	}

}
