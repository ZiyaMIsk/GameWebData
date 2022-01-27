package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;
import entities.concretes.Sale;

public class SaleJdbcDao implements SaleDao{

	public void add(Sale sale) {
		System.out.println("Satış veritabanina eklendi.");
		
	}

	public void update(Sale sale) {
		System.out.println("Satı veritabaninda güncellendi.");
		
	}

	public void delete(Sale sale) {
		System.out.println("Satış veritabanindan silindi.");
		
	}
}
