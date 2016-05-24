package com.example.dao;

public class Product {
	
	private String title;
	private String size;
	private Double unit_price;
	private String description;
	
	private Product (ProductBuilder pb) {
		this.title = pb.title;
		this.size = pb.size;
		this.unit_price= pb.unit_price;
		this.description = pb.description;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public static class ProductBuilder {
		private String title;
		private String size;
		private Double unit_price;
		private String description;
		
		public ProductBuilder title(String title) {
			this.title = title;
			return this;
		}
		
		public ProductBuilder size(String size) {
			this.size = size;
			return this;
		}
		
		public ProductBuilder unit_price(Double price) {
			this.unit_price = price;
			return this;
		}
		
		public ProductBuilder description(String description) {
			this.description = description;
			return this;
		}
		
		public Product build(){
			return new Product(this);
		}
	}
}
