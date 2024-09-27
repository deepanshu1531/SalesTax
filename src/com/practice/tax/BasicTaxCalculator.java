package com.practice.tax;

import com.practice.pojo.ExemptedProduct;
import com.practice.pojo.Product;

public class BasicTaxCalculator implements TaxCalculator {
	private static final double BASIC_TAX_RATE = 0.1;

	@Override
	public double calculateTax(Product product) {
		if (product instanceof ExemptedProduct) {
			return 0.0;
		}
		return roundUp(product.getPrice() * BASIC_TAX_RATE);
	}

	private double roundUp(double value) {
		return Math.ceil(value * 20.0) / 20.0;
	}
}
