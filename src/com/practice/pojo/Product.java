package com.practice.pojo;

import java.util.List;
import com.practice.tax.*;

public abstract class Product {
	protected String name;
	protected double price;
	public boolean isImported;

	public Product(String name, double price, boolean isImported) {
		this.name = name;
		this.price = price;
		this.isImported = isImported;
	}

	public abstract double calculatePriceWithTax(List<TaxCalculator> taxCalculators);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
