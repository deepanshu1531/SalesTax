package com.practice.receipt;

import com.practice.cart.ShoppingCart;
import com.practice.pojo.Product;

public class ReceiptPrinter {
	public void printReceipt(ShoppingCart cart) {
		System.out.println("------------------------------");
		for (Product product : cart.getProducts()) {
			double totalPriceWithTax = product.getPrice() + cart.getTaxCalculator().calculateTax(product);
			System.out.println(product.getName() + ": " + String.format("%.2f", totalPriceWithTax));
		}
		System.out.println("Sales Taxes: " + String.format("%.2f", cart.getTotalSalesTax()));
		System.out.println("Total: " + String.format("%.2f", cart.getTotalPrice()));
	}
}
