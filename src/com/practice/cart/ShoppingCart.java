package com.practice.cart;

import java.util.ArrayList;
import java.util.List;

import com.practice.pojo.Product;
import com.practice.tax.BasicTaxCalculator;
import com.practice.tax.ImportTaxCalculator;
import com.practice.tax.TaxCalculator;

public class ShoppingCart {
	private List<Product> products;

	public ShoppingCart() {
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public double getTotalSalesTax() {
		double totalTax = 0.0;
		for (Product product : products) {
			totalTax += product.calculatePriceWithTax(getTaxCalculators()) - product.getPrice();
		}
		return totalTax;
	}

	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.calculatePriceWithTax(getTaxCalculators());
		}
		return totalPrice;
	}

	public void printReceipt() {
		System.out.println("------------------------------");
		for (Product product : products) {
			System.out.println(product.getName() + ": "
					+ String.format("%.2f", product.calculatePriceWithTax(getTaxCalculators())));
		}
		System.out.println("Sales Taxes: " + String.format("%.2f", getTotalSalesTax()));
		System.out.println("Total: " + String.format("%.2f", getTotalPrice()));
	}

	private List<TaxCalculator> getTaxCalculators() {
		List<TaxCalculator> taxCalculators = new ArrayList<>();
		taxCalculators.add(new BasicTaxCalculator());
		taxCalculators.add(new ImportTaxCalculator());
		return taxCalculators;
	}
}
