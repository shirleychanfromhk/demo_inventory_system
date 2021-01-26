package com.example.demo;

public class Inventory {
	private String productId;
	private String originalLocation;
	private String newLocation;
	private int quantity;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOriginalLocation() {
		return originalLocation;
	}
	public void setOriginalLocation(String originalLocation) {
		this.originalLocation = originalLocation;
	}
	public String getNewLocation() {
		return newLocation;
	}
	public void setNewLocation(String newLocation) {
		this.newLocation = newLocation;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
