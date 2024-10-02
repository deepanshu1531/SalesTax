package com.practice.cart;

import com.practice.pojo.Product;
import com.practice.tax.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> products;
	private TaxCalculator taxCalculator;

	public ShoppingCart() {
		this.products = new ArrayList<>();
		this.taxCalculator = new TaxCalculator();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public List<Product> getProducts() {
		return products;
	}

	public double getTotalSalesTax() {
		double totalTax = 0.0;
		for (Product product : products) {
			totalTax += taxCalculator.calculateTax(product);
		}
		return totalTax;
	}

	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.getPrice() + taxCalculator.calculateTax(product);
		}
		return totalPrice;
	}

	public TaxCalculator getTaxCalculator() {
		return taxCalculator;
	}
}
