package com.practice.tax;

import com.practice.pojo.Product;

public class TaxCalculator {
	private static final double BASIC_TAX_RATE = 0.1;
	private static final double IMPORT_TAX_RATE = 0.05;

	public double calculateTax(Product product) {
		double tax = 0.0;

		if (!product.isExempted()) {
			tax += product.getPrice() * BASIC_TAX_RATE;
		}

		if (product.isImported()) {
			tax += product.getPrice() * IMPORT_TAX_RATE;
		}

		return roundUp(tax);
	}

	private double roundUp(double value) {
		return Math.ceil(value * 20.0) / 20.0;
	}
}
