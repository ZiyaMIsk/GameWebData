package business.concretes;

import business.abstracts.CampaignService;
import business.abstracts.SaleService;
import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Sale;

public class SaleManager implements SaleService{

	SaleDao saleDao;
	CampaignService campaignService;
	
	
	public SaleManager() {
		super();
	}


	public SaleManager(SaleDao saleDao, CampaignService campaignService) {
		super();
		this.saleDao = saleDao;
		this.campaignService = campaignService;
	}


	@Override
	public void add(Campaign campaign, Customer customer, Game game, Sale sale) {
		System.out.println(campaign.getCampaignName() + " kampanyası uygulandı." + " İndirim oranı %"
				+ campaign.getPercentOfCampaign());
		campaignService.applyCampaign(campaign, customer, game);
		sale.setGame(game);
		sale.setCustomer(customer);
		sale.setCampaign(campaign);
		saleDao.add(sale);

		
	}
	
	
	
}
