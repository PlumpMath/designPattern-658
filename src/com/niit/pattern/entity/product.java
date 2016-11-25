package com.niit.pattern.entity;

public class product {
	
	//constructor Method
	public product(int id, int quantity, String name, String brand, String category, String description, double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.price = price;
	}	
	
	//Getter and Setter Method.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//toString Method 
	@Override
	public String toString() {
		return "product [id=" + id + ", quantity=" + quantity + ", name=" + name + ", brand=" + brand + ", category="
				+ category + ", description=" + description + ", price=" + price + "]";
	}
	
	//Private Method Declaration.
	private int  id;
	private int  quantity;
	private String name;
	private String brand;
	private String category;
	private String description;
	private double price ;
	
}