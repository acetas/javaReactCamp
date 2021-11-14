package Abstract;

import Entities.Campaign;

public class CampaignManager {

	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " Campaign is added");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " Campaign is updated");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " Campaign is deleted");
	}
	
}
