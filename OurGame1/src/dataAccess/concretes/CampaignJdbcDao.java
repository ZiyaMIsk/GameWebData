package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class CampaignJdbcDao implements CampaignDao {

	
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi.");
		
	}

	
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi.");
		
	}

	
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");
		
	}
}
