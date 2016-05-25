package com.example.dao;

import java.util.Collections;
import java.util.List;

public class Results {
	
	private List<Product> results;
	private Double total=0.0;
	
	public List<Product> getResults() {
		return Collections.unmodifiableList(results);
	}
	public void setResults(List<Product> results) {
		this.results = results;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
}
