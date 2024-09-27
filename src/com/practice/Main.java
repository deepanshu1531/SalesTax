package com.practice;

import com.practice.cart.ShoppingCart;
import com.practice.pojo.ExemptedProduct;
import com.practice.pojo.TaxableProduct;

public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		cart.addProduct(new ExemptedProduct("book", 12.49, false));
		cart.addProduct(new TaxableProduct("music CD", 14.99, false));
		cart.addProduct(new ExemptedProduct("chocolate bar", 0.85, false));

		cart.printReceipt(); // Test Input 1

		ShoppingCart cart2 = new ShoppingCart();
		cart2.addProduct(new ExemptedProduct("imported box of chocolates", 10.00, true));
		cart2.addProduct(new TaxableProduct("imported bottle of perfume", 47.50, true));

		cart2.printReceipt(); // Test Input 2
	}
}
