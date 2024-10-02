# Sales Tax Calculator

This is a simple Java project to calculate sales tax for products in a shopping cart. The system supports two types of taxes:
1. **Basic Sales Tax**: Applied to non-exempt products.
2. **Import Duty**: Applied to imported products.

The project uses object-oriented principles and includes classes for managing products, calculating taxes, and printing receipts.

## Project Structure

```plaintext
src/
│
├── com/practice/cart/
│   └── ShoppingCart.java            # Manages a list of products and calculates total prices and taxes.
│
├── com/practice/pojo/
│   └── Product.java                 # Represents a product in the system (supports exempt and imported flags).
│
├── com/practice/tax/
│   └── TaxCalculator.java           # Calculates both basic tax and import tax for products.
│
├── com/practice/receipt/
│   └── ReceiptPrinter.java          # Handles printing the receipt with product details and totals.
│
└── com/practice/
    └── Main.java                    # Main class to demonstrate the system with example inputs.
```

git clone https://github.com/deepanshu1531/SalesTax.git
