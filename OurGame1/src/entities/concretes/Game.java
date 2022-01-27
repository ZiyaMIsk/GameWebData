package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	private String kindDescription;
	
	
	public Game() {
		super();
	}


	public Game(int id, String name, double price, String kindDescription) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kindDescription = kindDescription;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getKindDescription() {
		return kindDescription;
	}


	public void setKindDescription(String kindDescription) {
		this.kindDescription = kindDescription;
	}

}
