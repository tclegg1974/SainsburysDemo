package com.example.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Results {
	
	private List<Product> results = new ArrayList<>();
	private Double total=0.0;
	
	public List<Product> getResults() {
		return Collections.unmodifiableList(results);
	}
	public void add(Product product) {
		this.results.add(product);
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
}
