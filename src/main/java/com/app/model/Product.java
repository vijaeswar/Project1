package com.app.model;

public class Product {
	private int id;
	private String name;
	private String manufacturer;
	private double cost;
	
	
	public Product(int productId, String productName, String manufacturer2, double productCost) {
	}
	
	public Product( String productName, String manufacturer2, double productCost) {
	}



	public Product() {
		// TODO Auto-generated constructor stub
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		System.out.println("----------------------------------------------------------------------------------------------");
		return "Product Id=" + id + ", Name=" + name + ", Manufacturer=" + manufacturer + ", Cost=" + cost + "";
	}
	
	public String toSTring() {
		return " productname=" + name + ", manufacturer=" + manufacturer + ", cost=" + cost + "";
	}
	

}
