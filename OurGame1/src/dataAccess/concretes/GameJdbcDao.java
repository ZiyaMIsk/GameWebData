package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameJdbcDao implements GameDao{


	public void add(Game game) {
		System.out.println("Oyun Jdbc ile veritabanına eklendi.");
		
	}

	
	public void update(Game game) {
		System.out.println("Oyun Jdbc ile veritabanında güncellendi.");
		
	}

	
	public void delete(Game game) {
		System.out.println("Oyun Jdbc ile veritabanından silindi.");
		
	}

}
