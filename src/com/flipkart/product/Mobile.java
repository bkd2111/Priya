package com.flipkart.product;

public class Mobile implements Product {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "Samsung";
	}

	@Override
	public String getDescription() {
		return "galax7";
	}
	
	public  int getCameraInMP() {
		return 15;
	}
	
	public String getColor() {
		return "Black";
	}
	

}
