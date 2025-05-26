package api.payload;

import io.restassured.response.Response;
import lombok.Data;

@Data
public class Product {
	
	 
	private int id;
	private String name;
	private String color;
 	
	private double price;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice() {
		this.price = price;
	}
	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		this.price = price;
		
	}
	 
	
	
	
	
	
	
	

}
