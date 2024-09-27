package com.practice.pojo;

import java.util.List;
import com.practice.tax.*;

public class ExemptedProduct extends Product {
	public ExemptedProduct(String name, double price, boolean isImported) {
		super(name, price, isImported);
	}

	@Override
	public double calculatePriceWithTax(List<TaxCalculator> taxCalculators) {
		double totalTax = 0.0;
		for (TaxCalculator taxCalculator : taxCalculators) {
			totalTax += taxCalculator.calculateTax(this);
		}
		return price + totalTax;
	}
}
