package business.concretes;

import business.abstracts.CampaignService;
import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;

public class GameManager implements GameService{
	GameDao gameDao;
	CampaignService campaingService;
	
	
	public GameManager() {
		super();
	}


	public GameManager(GameDao gameDao, CampaignService campaignService) {
		super();
		this.gameDao = gameDao;
		this.campaingService = campaignService;
	}


	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
