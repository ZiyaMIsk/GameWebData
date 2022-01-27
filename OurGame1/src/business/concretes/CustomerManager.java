package business.concretes;

import business.abstracts.CustomerService;
import core.adapters.abstracts.MernisAdapterService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	
	private MernisAdapterService mernisAdapterService;
	
	
	public CustomerManager() {
		super();
	}


	public CustomerManager(MernisAdapterService mernisAdapterService) {
		super();
	
		this.mernisAdapterService = mernisAdapterService;
	}




	@Override
	public void update(Customer customer) {
if (mernisAdapterService.checkIfRealPerson(customer)) {
			
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlı kişi veritabanında güncellendi.");
		} 
		else {
			System.out.println("Böyle biri bulunmamaktadır.");
		}
		
	}


	@Override
	public void delete(Customer customer) {
if (mernisAdapterService.checkIfRealPerson(customer)) {
			
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlı kişi veritabanından silindi.");
		} 
		else {
			System.out.println("Böyle biri bulunmamaktadır.");
		}
		
	}


	public void Save(Customer customer) throws Exception {
		if (mernisAdapterService.checkIfRealPerson(customer)) {
			
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlı kişi veritabanına eklendi.");
		} 
		else {
			System.out.println("Böyle biri bulunmamaktadır.");
		}
		
	}


	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	

}
