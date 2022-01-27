package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;

public class CampaignManager implements CampaignService{

	CampaignDao campaignDao;

	public CampaignManager(CampaignDao campaignDao, Customer customer, Game game) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double applyCampaign(Campaign campaign, Customer customer, Game game) {
		System.out.println("Oyun güncel fiyatı: " + game.getPrice());
		double percent = 100-campaign.getPercentOfCampaign();
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " tarafından satın alındı.");
		double result = game.getPrice()*percent/100;
		System.out.println("Alınan oyunun indirimli fiyatı: " + result);
		return result;
	}

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
