import business.abstracts.CampaignService;
import business.abstracts.CustomerService;
import business.abstracts.GameService;
import business.abstracts.SaleService;
import business.concretes.CampaignManager;
import business.concretes.CustomerManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import core.adapters.abstracts.MernisAdapterService;
import core.adapters.concretes.MernisAdapterManager;
import dataAccess.concretes.CampaignJdbcDao;
import dataAccess.concretes.CustomerJdbcDao;
import dataAccess.concretes.GameJdbcDao;
import dataAccess.concretes.SaleJdbcDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Sale;
import dataAccess.abstracts.CampaignDao;
import dataAccess.abstracts.CustomerDao;

public class Main {

	public static void main(String[] args) throws Exception{
		Campaign campaign = new Campaign(1,"Büyük Alışveriş",50);
		Game game = new Game(1,"Call of Duty Modern Warfare 2 2022",700,"FPS Aksiyon Serisinin son oyunu...");
		Customer customer = new Customer(1,"ziya1995tr@gmail.com","dafster95ZMI:,", "Ziya Mustafa", "Işık" ,1995, "46966131006");
		Sale sale = new Sale();
		
		CustomerService customerService1 = new CustomerManager(new MernisAdapterManager());
		try {
			customerService1.Save(new Customer(1,"ziya1995tr@gmail.com","dafster95ZMI:,", "Ziya Mustafa", "Işık" ,1995, "46966131006"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CustomerService customerService2 = new CustomerManager(new MernisAdapterManager());
		try {
			customerService2.Save(new Customer(1,"ziya1995tr@gmail.com","dafster95ZMI:,", "Ziya Mustafa", "Işık" ,1990, "46966131006"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CampaignService campaingService = new CampaignManager(new CampaignJdbcDao(),new Customer(),new Game());
		
		campaingService.add(campaign);
		
		GameService gameService = new GameManager(new GameJdbcDao(), campaingService);
		
		gameService.add(game);
		
		SaleService saleService = new SaleManager(new SaleJdbcDao(), campaingService);
		
		
		saleService.add(campaign, customer, game, sale);
		

	}

}
