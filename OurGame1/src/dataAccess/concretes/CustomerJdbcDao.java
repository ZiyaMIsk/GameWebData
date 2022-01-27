package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerJdbcDao implements CustomerDao{
	
	
	public void add(Customer customer) {
		
		System.out.println(customer.getEmail() + " e-postası sisteme kaydedildi.");
		
	}

	
	public void update(Customer customer) {
		System.out.println(customer.getEmail() + " e-postası güncellendi.");
		
	}

	
	public void delete(Customer customer) {
		System.out.println(customer.getEmail() + " e-postası sistemden silindi.");
		
	}
	

	public void Save(Customer customer) throws Exception {
		
		
	}
}
