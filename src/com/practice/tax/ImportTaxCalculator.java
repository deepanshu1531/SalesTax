package com.practice.tax;

import com.practice.pojo.Product;

public class ImportTaxCalculator implements TaxCalculator {
	private static final double IMPORT_TAX_RATE = 0.05;

	@Override
	public double calculateTax(Product product) {
		if (product.isImported) {
			return roundUp(product.getPrice() * IMPORT_TAX_RATE);
		}
		return 0.0;
	}

	private double roundUp(double value) {
		return Math.ceil(value * 20.0) / 20.0;
	}
}
