package com.practice;

import com.practice.cart.ShoppingCart;
import com.practice.pojo.Product;
import com.practice.receipt.ReceiptPrinter;

public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct(new Product("book", 12.49, true, false));
		cart.addProduct(new Product("music CD", 14.99, false, false));
		cart.addProduct(new Product("chocolate bar", 0.85, true, false));

		ReceiptPrinter printer = new ReceiptPrinter();
		printer.printReceipt(cart);

		ShoppingCart cart2 = new ShoppingCart();
		cart2.addProduct(new Product("imported box of chocolates", 10.00, true, true));
		cart2.addProduct(new Product("imported bottle of perfume", 47.50, false, true));

		printer.printReceipt(cart2);
	}
}
